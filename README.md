# Bankease

Demo project for Spring Boot

## Prerequisites

- Java 21

## Building the Project

To build the project, run the following command:

```bash
.\mvnw.cmd clean package
```

This will compile the code and package it into a JAR file.

## Running the Application

After building, you can run the application using:

```bash
java -jar .\target\bankease-0.0.1-SNAPSHOT.jar
```

The application will start and be available at `http://localhost:8080` (assuming default Spring Boot port).

### Running with a profile

Spring Boot supports activating profiles via the `spring.profiles.active` property.

- **Development:**

```bash
java -Dspring.profiles.active=dev -jar .\target\bankease-0.0.1-SNAPSHOT.jar
```

- **Production:**

```bash
java -Dspring.profiles.active=prod -jar .\target\bankease-0.0.1-SNAPSHOT.jar
```
