## MySQL - create the database and the table
```
CREATE database DB;
CREATE table DB.dangerReports(
timestamp float NOT NULL,
vehicleDistance float NOT NULL,
vehicleSpeed float NOT NULL,
bikeSpeed float NOT NULL,
latitude float NOT NULL,
longitude float NOT NULL,
dangerous bool NOT NULL
);
```
