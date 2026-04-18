# ==========================================
# Stage 1: Build the application using Maven
# ==========================================
# Note: Adjust '17' to match the Java version in your pom.xml (e.g., 8, 11, or 17)
FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the pom.xml and source code to the container
COPY pom.xml .
COPY src ./src

# Package the application into a .war file
# -DskipTests speeds up deployment by skipping unit tests during the build
RUN mvn clean package -DskipTests

# ==========================================
# Stage 2: Run the application using Tomcat
# ==========================================
# Note: Tomcat 9 is recommended for Spring 5/Hibernate 5. 
# Tomcat 10+ uses Jakarta EE which breaks older Spring apps using javax.* imports.
FROM tomcat:9.0-jre17

# (Optional) Remove default Tomcat apps to keep the container clean
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the .war file from the build stage into Tomcat's webapps directory.
# Renaming it to ROOT.war ensures your app is accessible at the root URL (/) 
# instead of /your-app-name/
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]