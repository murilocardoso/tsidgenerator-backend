# Use uma imagem base do Maven para construir o projeto
FROM maven:3.8.5-openjdk-17 AS build

# Copie o código-fonte para a imagem
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

# Navegue até o diretório da aplicação
WORKDIR /usr/src/app

# Execute a construção do projeto
RUN mvn clean package -DskipTests && \
    rm -rf ~/.m2/repository

# Use uma imagem base do JDK 17 para a aplicação
FROM openjdk:17-jdk-slim

# Copie o jar construído da etapa anterior
COPY --from=build /usr/src/app/target/*.jar app.jar

# Exponha a porta que sua aplicação usará
EXPOSE 8080

# Comando para executar sua aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]
