# Java Spring-Boot Templates

## Dependencies

Add `starter thymeleaf` to pom.xml for template parsing.

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

### Application

Spring web project with `Thymealf` and Spring Boot DevTools. 

#-- java/src/minte9/webcontent/App.java --#

### Controller

The `GreetingController` handle GET requests for /greeting.

#-- java/src/minte9/webcontent/GreetingController.java --#


### Templates

Thymeleaf parses the `hello.html` template.

#-- resources/templates/hello.html --#


### Run

With Spring Boot `DevTools` you don't need to restart the server, after code changes.

~~~sh
mvn spring-boot:run

http://localhost:8080
http://localhost:8080/hello
http://localhost:8080/hello?username=John

# Welcome!
# Hello, guest!
# Hello, John!
~~~