# Java Spring-Boot Ajax

## Ajax App

Create a new `Spring Web` project.

~~~
spring init --build=maven --dependencies=web ajax 
~~~
#-- java/com/minte9/ajax/App.java --#

### Client

The `jQuery` module consumes the REST service.
The public/`index.html` loads the client into the user's browser.

#-- ../../public/index.html --#

### Service

The `REST controller` displays the response as JSON.

#-- java/com/minte9/ajax/CronoController.java --#

### Run

Test and `run` the application.

#--
mvn spring-boot:run

http://localhost:8080/
    # 15:56:30
~~~