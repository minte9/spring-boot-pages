# Java Spring-Boot Ajax

## Ajax App

Create a new `Spring Web` project.

https://github.com/minte9/spring-boot-pages/blob/f4d172a0b5f1a7706a639a620921dc755b0337c9/ajax/src/main/java/com/minte9/ajax/App.java#L1-L19

### Client

The `jQuery` module consumes the REST service.
The `public/index.html` loads the client into the user's browser.

https://github.com/minte9/spring-boot-pages/blob/c64d1e4521a787e372b0c61fabc43f67380347fc/ajax/public/index.html#L1-L43

### Service

The `REST controller` displays the response as JSON.

https://github.com/minte9/spring-boot-pages/blob/c64d1e4521a787e372b0c61fabc43f67380347fc/ajax/src/main/java/com/minte9/ajax/CronoController.java#L9-L49

### Run

Test and `run` the application.

~~~
mvn spring-boot:run

http://localhost:8080/
    # 15:56:30
~~~

## References

https://spring.io/guides/gs/consuming-rest-jquery  
https://spring.io/guides/gs/rest-service-cors  
https://www.minte9.com/java/spring-boot-ajax-1310
