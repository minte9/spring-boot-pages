# Java Spring-Boot Consuming Rest

## Service API

Run service api `rest_service` in a separate terminal on port 9090.

#--
cd rest_service
mvn spring-boot:run # start service

http://localhost:9090
http://localhost:8080/getquote/1
http://localhost:8080/getquote/2
--#

### Client App

The application will retrive `quotes` from a RESTful web service.

~~~
http://localhost:9090/getquote/1
# {"type":"success","value":{"id":7,"quote":"The real benefit of Boot, ...

http://localhost:9090/getquote/2
# Quote{type='success', value=Value{id='7', quote=The real benefit of Boot, ...
~~~

### Run client

Start a new `Spring Boot Web` project on port 8080

~~~ini
# /src/main/resources/application.properties

server.port=8080
~~~

Change maven `compiler version`, if needed.

~~~
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.5.4</version>
</parent>
~~~

### Main

Application class with `mapping` /getquote

#-- consuming_rest/App.java --#

### Model

Domain classes, `Quote` and Value.

#-- consuming_rest/Quote.java --#
#-- consuming_rest/Value.java --#


### Test

Build and run the application in `console` or browser.

~~~
cd consuming_rest/
mvn spring-boot:run

# browser
  http://localhost:9090/getquote

# console
  java -jar target/democonsumingrest-0.0.1.jar 

# result
Quote{type='success', value=Value{id='9', quote='Spring Boot solves ...'}
~~~