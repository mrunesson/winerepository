package org.linuxalert.wine.repository.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.locations.*
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

import org.linuxalert.wine.repository.generated.Paths

fun Route.DefaultApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.wineRepositoryGet> { it: Paths.wineRepositoryGet ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "vintage" : "vintage",
          "name" : "test",
          "id" : "id",
          "winery" : {
            "name" : "name",
            "id" : "id",
            "homepage" : "homepage"
          },
          "region" : {
            "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
            "id" : "id"
          },
          "url" : "url",
          "sellers" : [ {
            "sellerItemId" : "sellerItemId"
          }, {
            "sellerItemId" : "sellerItemId"
          } ],
          "labels" : [ "labels", "labels" ],
          "grapes" : [ {
            "id" : "id"
          }, {
            "id" : "id"
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    route("/wine/repository") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "vintage" : "vintage",
              "name" : "name",
              "id" : "id",
              "winery" : {
                "name" : "name",
                "id" : "id",
                "homepage" : "homepage"
              },
              "region" : {
                "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
                "id" : "id"
              },
              "url" : "url",
              "sellers" : [ {
                "sellerItemId" : "sellerItemId"
              }, {
                "sellerItemId" : "sellerItemId"
              } ],
              "labels" : [ "labels", "labels" ],
              "grapes" : [ {
                "id" : "id"
              }, {
                "id" : "id"
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/wine/repository") {
        put {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "vintage" : "vintage",
              "name" : "name",
              "id" : "id",
              "winery" : {
                "name" : "name",
                "id" : "id",
                "homepage" : "homepage"
              },
              "region" : {
                "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
                "id" : "id"
              },
              "url" : "url",
              "sellers" : [ {
                "sellerItemId" : "sellerItemId"
              }, {
                "sellerItemId" : "sellerItemId"
              } ],
              "labels" : [ "labels", "labels" ],
              "grapes" : [ {
                "id" : "id"
              }, {
                "id" : "id"
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    get<Paths.wineRepositoryWineIdGet> { it: Paths.wineRepositoryWineIdGet ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "vintage" : "vintage",
          "name" : "name",
          "id" : "id",
          "winery" : {
            "name" : "name",
            "id" : "id",
            "homepage" : "homepage"
          },
          "region" : {
            "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
            "id" : "id"
          },
          "url" : "url",
          "sellers" : [ {
            "sellerItemId" : "sellerItemId"
          }, {
            "sellerItemId" : "sellerItemId"
          } ],
          "labels" : [ "labels", "labels" ],
          "grapes" : [ {
            "id" : "id"
          }, {
            "id" : "id"
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    route("/wine/repository/{wineId}") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "vintage" : "vintage",
              "name" : "name",
              "id" : "id",
              "winery" : {
                "name" : "name",
                "id" : "id",
                "homepage" : "homepage"
              },
              "region" : {
                "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
                "id" : "id"
              },
              "url" : "url",
              "sellers" : [ {
                "sellerItemId" : "sellerItemId"
              }, {
                "sellerItemId" : "sellerItemId"
              } ],
              "labels" : [ "labels", "labels" ],
              "grapes" : [ {
                "id" : "id"
              }, {
                "id" : "id"
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/wine/repository/{wineId}") {
        put {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "vintage" : "vintage",
              "name" : "name",
              "id" : "id",
              "winery" : {
                "name" : "name",
                "id" : "id",
                "homepage" : "homepage"
              },
              "region" : {
                "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
                "id" : "id"
              },
              "url" : "url",
              "sellers" : [ {
                "sellerItemId" : "sellerItemId"
              }, {
                "sellerItemId" : "sellerItemId"
              } ],
              "labels" : [ "labels", "labels" ],
              "grapes" : [ {
                "id" : "id"
              }, {
                "id" : "id"
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    get<Paths.wineRepositoryWineIdVintageGet> { it: Paths.wineRepositoryWineIdVintageGet ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "vintage" : "vintage",
          "name" : "name",
          "id" : "id",
          "winery" : {
            "name" : "name",
            "id" : "id",
            "homepage" : "homepage"
          },
          "region" : {
            "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
            "id" : "id"
          },
          "url" : "url",
          "sellers" : [ {
            "sellerItemId" : "sellerItemId"
          }, {
            "sellerItemId" : "sellerItemId"
          } ],
          "labels" : [ "labels", "labels" ],
          "grapes" : [ {
            "id" : "id"
          }, {
            "id" : "id"
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    route("/wine/repository/{wineId}/{vintage}") {
        put {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "vintage" : "vintage",
              "name" : "name",
              "id" : "id",
              "winery" : {
                "name" : "name",
                "id" : "id",
                "homepage" : "homepage"
              },
              "region" : {
                "nameHierarchy" : [ "nameHierarchy", "nameHierarchy" ],
                "id" : "id"
              },
              "url" : "url",
              "sellers" : [ {
                "sellerItemId" : "sellerItemId"
              }, {
                "sellerItemId" : "sellerItemId"
              } ],
              "labels" : [ "labels", "labels" ],
              "grapes" : [ {
                "id" : "id"
              }, {
                "id" : "id"
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    
}
