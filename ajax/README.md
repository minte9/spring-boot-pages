# Java Spring-Boot Ajax

## Ajax App

Create a new `Spring Web` project.

~~~
spring init --build=maven --dependencies=web ajax 
~~~ 
https://github.com/minte9/spring-boot-pages/blob/c64d1e4521a787e372b0c61fabc43f67380347fc/ajax/src/main/java/com/minte9/ajax/App.java#L6-L13

### Client

The `jQuery` module consumes the REST service.
The public/`index.html` loads the client into the user's browser.

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
