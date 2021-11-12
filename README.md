# Central server Rest API

REST Api for the central server database (link between Monitor and database)

## Git
To retrieve the project, run :
```
git clone https://github.com/keti-hackathon-insa-ajata/RESTApi.git
```

## Prerequisites 
  * Git
  * Maven
  * Java 8
  * MySQL

## MySQL Initialization

- Create the database :
```sql
CREATE database DB;
```

- Create a user and give permissions : 
```sql
CREATE USER 'root'@'localhost' IDENTIFIED BY '';
GRANT ALL PRIVILEGES ON DB.* TO 'root'@'localhost';
```

- Create the table :
```sql
CREATE table DB.dangerReports(
id int NOT NULL AUTO_INCREMENT,
timestamp int NOT NULL,
distance float NOT NULL,
object_speed float NOT NULL,
bicycle_speed float NOT NULL,
latitude float NOT NULL,
longitude float NOT NULL,
dangerous bool NOT NULL,
PRIMARY KEY (id)
);
```

## Build
```
mvn clean install
```
This create a single jar file (in the /target folder) named RestApi.jar (for example).

## Run
```
java -jar RestApi.jar
```

## API
  * The REST Api is accessible at: http://localhost:12345/dangerReports (on the server, or replace "localhost" with the IP address of the server)
  * GET requests are used to get the data
  * We can filter the data to get only the dangerous reports by accessing http://localhost:12345/dangerReports?dangerous=true (on the server, or replace "localhost" with the IP address of the server)
  * POST requests are used to create new danger reports

## JSON format for POST requests
Example
```json
{
    "timestamp": 1635497504,
    "distance": 300.0,
    "object_speed": 60.0,
    "bicycle_speed": 7.0,
    "latitude": 43.57037533253987,
    "longitude": 1.468026024931181
}
```

## Optional configuration
If you want to run the REST API on a different port, or to change the database user, you can configure the file /src/main/resources/application.properties: 
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/DB
spring.datasource.username=root
spring.datasource.password=
server.port=12345
```
