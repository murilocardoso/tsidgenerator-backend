# Use uma imagem base do Java
FROM amazoncorretto:17-alpine-jdk

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copie o jar da sua aplicação para o diretório de trabalho
COPY target/tsidgenerator-0.0.1-SNAPSHOT.jar /app/tsidgenerator-0.0.1-SNAPSHOT.jar

EXPOSE 8080

# Define o comando padrão para rodar a aplicação
CMD ["java", "-jar", "/app/tsidgenerator-0.0.1-SNAPSHOT.jar"]
