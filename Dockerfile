FROM openjdk:11
COPY ./target/MavenDemo-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "MavenDemo-1.0-SNAPSHOT.jar"]