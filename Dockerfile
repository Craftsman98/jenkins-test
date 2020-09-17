FROM 11.11.110.94:5000/java:8-jre

ADD ./target/LoginRegister.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/LoginRegister.jar"]

EXPOSE 8080
