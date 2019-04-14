package org.linuxalert.wine.repository

import com.codahale.metrics.*
import com.typesafe.config.ConfigFactory
import io.ktor.application.*
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.config.HoconApplicationConfig
import io.ktor.features.*
import io.ktor.gson.GsonConverter
import io.ktor.http.ContentType
import io.ktor.locations.*
import io.ktor.metrics.*
import io.ktor.routing.*
import io.ktor.util.KtorExperimentalAPI
import org.linuxalert.wine.repository.apis.DefaultApi
import org.linuxalert.wine.repository.generated.ApplicationCompressionConfiguration
import java.util.concurrent.*


@KtorExperimentalAPI
internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

@KtorExperimentalAPI
@KtorExperimentalLocationsAPI
fun Application.main() {
    install(DefaultHeaders)
    install(Metrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
                .outputTo(log)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see http://ktor.io/features/autoheadresponse.html
    install(ConditionalHeaders) // see http://ktor.io/features/conditional-headers.html
    install(Compression, ApplicationCompressionConfiguration()) // see http://ktor.io/features/compression.html
    install(Locations) // see http://ktor.io/features/locations.html
    install(Routing) {
        DefaultApi()
    }


    environment.monitor.subscribe(ApplicationStopping)
    {
        HTTP.client.close()
    }
}
