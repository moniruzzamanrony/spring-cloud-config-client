# Spring Cloud Config Client

Step 1: Run [This Project](https://github.com/monirozzaman/spring-cloud-config-server)<br>
Step 2: Run this command to start `mvn spring-boot:run`

## Test API
* For refrash project after propertics/yml file change in [github repository](https://github.com/monirozzaman/spring-cloud-config-ymls)<br>
`POST http://localhost:2222/actuator/refresh`<br>
* For test changed out<br>
`GET http://localhost:2222`
