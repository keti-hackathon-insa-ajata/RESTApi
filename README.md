## Prerequisites 
  * Maven
  * Java 8
  * MYSQL

## MySQL - create the database and the table
```sql
CREATE database DB;
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
