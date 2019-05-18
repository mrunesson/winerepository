package org.linuxalert.wine.repository.apis

import com.google.gson.Gson
import io.ktor.application.application
import io.ktor.application.call
import io.ktor.application.feature
import io.ktor.http.ContentType
import io.ktor.locations.*
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*
import io.micrometer.prometheus.PrometheusConfig
import io.micrometer.prometheus.PrometheusMeterRegistry

import org.linuxalert.wine.repository.generated.Paths

fun Route.MetricsApi(registry : PrometheusMeterRegistry) {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()


    route("/metrics") {
        get {
            call.respondText { registry.scrape() }
        }
    }
    
}
