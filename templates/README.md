# Java Spring-Boot Templates

## Application

Spring web project with `Thymealf` and Spring Boot DevTools. 

~~~xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
~~~

### Controller

The `GreetingController` handle GET requests for /greeting.

#-- java/com/minte9/templates/GreetingController.java --#


### Templates

Thymeleaf parses the `resources/templates/hello.html` template.

#-- resources/templates/hello.html --#


### Run

With Spring Boot `DevTools` you don't need to restart the server, after code changes.

~~~sh
mvn spring-boot:run

http://localhost:8080
http://localhost:8080/hello
http://localhost:8080/hello/?username=John

# Welcome!
# Hello, guest!
# Hello, John!
~~~