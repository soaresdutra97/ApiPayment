FROM openjdk:17-jdk

WORKDIR /app

COPY build/libs/pagamento-0.0.1-SNAPSHOT.jar /app/pagamento.jar

EXPOSE 8383

CMD ["java", "-jar", "/app/pagamento.jar"]

