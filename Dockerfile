FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-book.jar spring-boot-book.jar
ENTRYPOINT [ "java","-jar","/spring-boot-book.jar" ]