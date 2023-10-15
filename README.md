# Spring Boot Web Application with Spring Security

This is a simple Spring Boot web application that demonstrates how to set up web security using Spring Security and Thymeleaf templates. It provides a basic login and authentication system.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Customization](#customization)

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven (for building and managing dependencies)

## Project Structure

The project consists of the following components:

- **HTML Templates**: Three HTML templates are provided, each for different purposes.
  - `home.html`: Home page.
  - `hello.html`: Greeting page.
  - `login.html`: Login page.
  
- **Java Configuration Classes**:
  - `MvcConfig.java`: Configuration for setting up view controllers.
  - `WebSecurityConfig.java`: Configuration for Spring Security.

- **POM.xml**: Maven project configuration file.

## Usage

1. Clone or download the project to your local machine.

2. Make sure you have JDK 17 and Maven installed.

3. Build and run the project:
   ```shell
   mvn spring-boot:run
   
## Access the Application

To access the application, open your web browser and visit the following URLs:

- **Home Page:** [http://localhost:8080/home](http://localhost:8080/home)
- **Greeting Page:** [http://localhost:8080/hello](http://localhost:8080/hello)
- **Login Page:** [http://localhost:8080/login](http://localhost:8080/login)

## Login with Test User

You can log in using the provided test user credentials:

- **Username:** user
- **Password:** password

Explore the application, including basic authentication and logging out.

## Customization

You can customize this project by making changes to the HTML templates, Java configuration classes, and other resources. Feel free to add additional functionality, modify the look and feel, or integrate it with your specific requirements.

For more information on Spring Boot and Spring Security, refer to the official documentation:

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Spring Security Documentation](https://docs.spring.io/spring-security/site/docs/current/reference/html5/)
