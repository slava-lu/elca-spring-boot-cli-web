# Elca Spring Boot Web Module

## Description

The Elca Spring Boot Web Module contains the necessary dependencies to integrate Spring REST API functionality into an existing project.

## Prerequisites
* Java Development Kit (JDK) 17 or higher. [Installation instruction](https://www.oracle.com/java/technologies/downloads/)
* Spring CLI installed on your system. [Installation instruction](https://docs.spring.io/spring-cli/reference/installation.html)

## How to use

* Ensure that the Spring CLI is installed and available in your system's PATH: `spring version`
* Add the ELCA catalog to the Spring CLI, if not already done, by running: `spring project-catalog add elca https://github.com/slava-lu/elca-spring-boot-cli-starter`,
  Here, _elca_ is an arbitrary name you assign to the catalog
* Check that the catalog has been registered properly: `spring project-catalog list`. You should see the catalog with the name _elca_ in the output.
* Navigate to the root folder of the existing Java Spring Boot project
* Run `spring boot add elca-web`

## Dependencies list
* Rest Repositories
* Rest Repositories HAL Explorer
* Spring REST Docs
* Springdoc-openapi (Swagger)

## Additional info
* After starting the app the repository is initialized with two Todo items.
* Get All Todos: http://localhost:8080/api/todo
* Get a Single Todo: http://localhost:8080/api/todo/1
* All available endpoints can be viewed with Swagger http://localhost:8080/swagger-ui/index.html

