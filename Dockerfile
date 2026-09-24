FROM  eclipse-temurin:17-jdk

COPY target/proj22 /user/app/

WORKDIR /user/app/

EXPOSE 8080

ENTRYPOINT [ "java","-jar","proj22.jar"]