## MySQL - create the database and the table
```
CREATE database DB;
CREATE table DB.dangerReports(
timestamp float NOT NULL,
distance float NOT NULL,
object_speed float NOT NULL,
bicycle_speed float NOT NULL,
latitude float NOT NULL,
longitude float NOT NULL,
dangerous bool NOT NULL
);
```

## The REST Api is accessible at http://localhost:12345/dangerReports
