# Use uma imagem base do JDK 17
FROM openjdk:17-jdk-slim

# Adicione um argumento para especificar a versão do jar
ARG JAR_FILE=target/*.jar

# Copie o jar da sua aplicação para a imagem
COPY ${JAR_FILE} app.jar

# Exponha a porta que sua aplicação usará
EXPOSE 8080

# Comando para executar sua aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]