# Java Spring-Boot Consuming Rest

## Run Service

Run `rest_service` in a separate terminal on port 9090.

~~~sh
cd rest_service/
mvn spring-boot:run # start service

http://localhost:9090
  # Welcome! Use /quote/{id}
~~~

### Client App

The application will retrive `quotes` from the REST web service.

~~~sh
http://localhost:9090/getquote/1
  # {"id":1,"content":"Spring Boot makes stand alone Spring apps easy."}

http://localhost:9090/getquote/2
  # {"id":2,"content":"With Boot you deploy everywhere."}
~~~

### Run client

Start a new Spring Boot `Web` project on port 8080

~~~ini
# src/main/resources/application.properties

server.port=8080
~~~

### Main

Application class with `/request_quote` mapping.

https://github.com/minte9/spring-boot-pages/blob/6842531db4f2385203379a75e23e922989fbf351/consuming_rest/src/main/java/com/minte9/consuming_rest/App.java#L22-L64


### Test requests

Build and run the application in `console` or browser.

~~~sh
cd consuming_rest/
mvn spring-boot:run

http://localhost:9090/getquote
  # {"id":1,"content":"Spring Boot makes stand alone Spring apps easy."}

java -jar target/consuming_rest-0.0.1.jar 
  # {"id":2,"content":"With Boot you deploy everywhere."}
~~~

### References

https://spring.io/guides/gs/consuming-rest  
https://github.com/spring-guides/quoters  
https://minte9.com/java/spring-boot-consuming-rest-1384  
