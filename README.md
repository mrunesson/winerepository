# Wine repository

Microservice to store data about wines.

## Develop

## Requires

* Kotlin 1.3.30

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Running

The server builds as a fat jar with a main entrypoint. To start the service, run `java -jar ./build/libs/kotlin-server.jar`.

You may also run in docker:

```
docker build -t kotlin-server .
docker run -p 8080:8080 kotlin-server
```

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs (see ktor documentation for more info).
* ~Supports collection formats for query parameters: csv, tsv, ssv, pipes.~
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://winerepository/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**wineRepositoryGet**](docs/DefaultApi.md#winerepositoryget) | **GET** /wine/repository | Get all wines in repository
*DefaultApi* | [**wineRepositoryPost**](docs/DefaultApi.md#winerepositorypost) | **POST** /wine/repository | Add a new wine
*DefaultApi* | [**wineRepositoryPut**](docs/DefaultApi.md#winerepositoryput) | **PUT** /wine/repository | Update an existing wine
*DefaultApi* | [**wineRepositoryWineIdGet**](docs/DefaultApi.md#winerepositorywineidget) | **GET** /wine/repository/{wineId} | Get wine with id
*DefaultApi* | [**wineRepositoryWineIdPost**](docs/DefaultApi.md#winerepositorywineidpost) | **POST** /wine/repository/{wineId} | Add a new vintage
*DefaultApi* | [**wineRepositoryWineIdPut**](docs/DefaultApi.md#winerepositorywineidput) | **PUT** /wine/repository/{wineId} | Update an existing wine
*DefaultApi* | [**wineRepositoryWineIdVintageGet**](docs/DefaultApi.md#winerepositorywineidvintageget) | **GET** /wine/repository/{wineId}/{vintage} | Get wine with id and vintage
*DefaultApi* | [**wineRepositoryWineIdVintagePut**](docs/DefaultApi.md#winerepositorywineidvintageput) | **PUT** /wine/repository/{wineId}/{vintage} | Update an existing vintage of a wine


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.models.ContentGrape](docs/ContentGrape.md)
 - [org.openapitools.server.models.Region](docs/Region.md)
 - [org.openapitools.server.models.SellerItem](docs/SellerItem.md)
 - [org.openapitools.server.models.Wine](docs/Wine.md)
 - [org.openapitools.server.models.Winery](docs/Winery.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
