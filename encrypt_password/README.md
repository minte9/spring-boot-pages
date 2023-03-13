# Java Spring-Boot Encrypt Password

## Application

Spring web application with `mysql` connection.
~~~
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<scope>runtime</scope>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jdbc</artifactId>
</dependency>

<!--
<dependency>
	<groupId>com.oracle.database.jdbc</groupId>
	<artifactId>ojdbc8</artifactId>
</dependency>
-->
~~~

Map an entry for `generate encrypted` password.

https://github.com/minte9/spring-boot-pages/blob/3a669bd133eb725c03ebd7dcf4450b9072f40a80/encrypt_password/src/main/java/com/minte9/encrypt_password/App.java#L19-L37

~~~
// resources/application.properties

spring.datasource.url = jdbc:mysql://localhost:3306/db_example
spring.datasource.username = springuser
spring.datasource.password = oKGQSuLmEKbssroQ7XhE2Dy5vKGk2Zd00yXV
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver

// spring.datasource.key = environment_variable
// spring.datasource.iv = environment_variable
~~~

### Decrypt

DataSource bean in configuration file reads the `encrypted password`.

https://github.com/minte9/spring-boot-pages/blob/3a669bd133eb725c03ebd7dcf4450b9072f40a80/encrypt_password/src/main/java/com/minte9/encrypt_password/AppConfig.java#L29-L78

### AES GCM

GCM is `proven secure` in the concrete security model.

https://github.com/minte9/spring-boot-pages/blob/3a669bd133eb725c03ebd7dcf4450b9072f40a80/encrypt_password/src/main/java/com/minte9/encrypt_password/AES_GCM.java#L19-L71


### Refrences

https://www.baeldung.com/spring-boot-configure-data-source-programmatic
https://www.minte9.com/java/spring-boot-encrypt-password-1451