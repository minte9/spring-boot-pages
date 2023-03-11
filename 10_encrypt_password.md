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

~~~ encrypt_password/App.java ~~

~~~
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
~~~
encrypt_password/AppConfig.java
~~~

### AES GCM

GCM is `proven secure` in the concrete security model.

#-- encrypt_password/AES_GCM.java --#