# Use uma imagem base do Java
FROM openjdk:11-jre-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copie o jar da sua aplicação para o diretório de trabalho
COPY target/tsidgenerator-0.0.1-SNAPSHOT.jar /app/tsidgenerator-0.0.1-SNAPSHOT.jar

# Define o comando padrão para rodar a aplicação
CMD ["java", "-jar", "tsidgenerator-0.0.1-SNAPSHOT.jar"]
