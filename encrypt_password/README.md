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

Add `encrypted password` to application.properties.

https://github.com/minte9/spring-boot-pages/blob/42adbc00b9e2547b8d9339e6085c6188806cbc46/encrypt_password/src/main/resources/application.properties#L1-L6

### Decrypt

DataSource bean in configuration file reads the `encrypted password`.

https://github.com/minte9/spring-boot-pages/blob/3a669bd133eb725c03ebd7dcf4450b9072f40a80/encrypt_password/src/main/java/com/minte9/encrypt_password/AppConfig.java#L29-L78

### AES GCM

GCM is `proven secure` in the concrete security model.

https://github.com/minte9/spring-boot-pages/blob/3a669bd133eb725c03ebd7dcf4450b9072f40a80/encrypt_password/src/main/java/com/minte9/encrypt_password/AES_GCM.java#L19-L71


### References

https://www.baeldung.com/spring-boot-configure-data-source-programmatic 

### Web page

https://www.minte9.com/java/spring-boot-encrypt-password-1451
