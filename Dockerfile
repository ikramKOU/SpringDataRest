# FROM eclipse-temurin:17-jre

# WORKDIR /app

# COPY target/SpringDataRest-0.0.1-SNAPSHOT.jar app.jar

# EXPOSE 8082

# ENTRYPOINT ["java","-jar","app.jar"]
# Utiliser JDK 17



FROM eclipse-temurin:17-jre

WORKDIR /app

# Copier le JAR généré par Maven/Gradle
COPY target/SpringDataRest-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]
