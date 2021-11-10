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

## The REST Api is accessible at:
http://localhost:12345/dangerReports

## Build
```
mvn clean install
```