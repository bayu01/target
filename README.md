# A Spring Boot and MongoDb Web Application

## Technology Stack

Spring Boot 2.0

Spring Framework 5.0.4

Spring Data MongoDB 2.0.5

AssertJ 3.9

Junit 4.12

Gradle

Java JDK 8+

MongoDB 3.6



## Setup

### Java

Verify that a version of Java 8 or above is installed in your system.

Verify that the environment variable JAVA_HOME is correctly pointing to the Java installation folder. The Graddle Wrapper makes use of this variable.

### MongoDb

Install [MongoDb](https://www.mongodb.com/download-center?jmp=nav#community) and if necessary follow the installation instructions in [here](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/).

The application expects a local MongoDb server (`mongod.exe`) running under the default port number `27017`.

### Source Code

Use Git clone this repository `git clone https://github.com/bayu01/target.git` .



## Run the Application

Use the Graddle Wrapper command `gradlew bootRun` to start the application. The embedded Tomcat server starts at port `8080`. The exposed endpoint is documented below.

| Name                 | Description             |
| -------------------- | ----------------------- |
| Title                | Get Product Description |
| URL                  | /product/:id            |
| URL Params           | Required: id=[integer]  |
| Response Body (JSON) | **ProductWrapper**      |

A **ProductWrapper** is a JSON object that follows the structure:

```javascript
{
	"product": {
		"item": {
			"product_description": {
				"title": "Some product name here."
			}
		}
	}
}
```

### Examples:

Request: `http://localhost:8080/product/13860428`

Response: 

```javascript
{
	"product": {
		"item": {
			"product_description": {
				"title": "SpongeBob SquarePants: SpongeBob's Frozen Face-off"
			}
		}
	}
}
```



## Run Tests

Use the Graddle Wrapper command `gradlew test` to run tests.
