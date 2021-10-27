package RESTApi.model;

import javax.persistence.*;

@Entity
@Table(name = "dangerreports")
public class DangerReport {
    @Id
    @Column(name = "timestamp", nullable=false)
    private float timestamp;
    @Column(name = "vehicledistance", nullable=false)
    private float vehicleDistance;
    @Column(name = "vehiclespeed", nullable=false)
    private float vehicleSpeed;
    @Column(name = "bikespeed", nullable=false)
    private float bikeSpeed;
    @Column(name = "latitude", nullable=false)
    private float latitude;
    @Column(name = "longitude", nullable=false)
    private float longitude;
    @Column(name = "dangerous", nullable=false)
    private int dangerous;

    public DangerReport() {
    }

    public DangerReport(float timestamp, float vehicleDistance,
                        float vehicleSpeed, float bikeSpeed,
                        float latitude, float longitude,
                        int dangerous) {
        this.timestamp = timestamp;
        this.vehicleDistance = vehicleDistance;
        this.vehicleSpeed = vehicleSpeed;
        this.bikeSpeed = bikeSpeed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dangerous = dangerous;
    }

//other setters and getters

    @Column(name = "timestamp")
    public float getTimestamp() {
        return timestamp;
    }

    @Column(name = "vehicledistance")
    public float getVehicleDistance() {
        return vehicleDistance;
    }

    @Column(name = "vehiclespeed")
    public float getVehicleSpeed() {
        return vehicleSpeed;
    }

    @Column(name = "bikespeed")
    public float getBikeSpeed() {
        return bikeSpeed;
    }

    @Column(name = "latitude")
    public float getLatitude() {
        return latitude;
    }

    @Column(name = "longitude")
    public float getLongitude() {
        return longitude;
    }

    @Column(name = "dangerous")
    public int getDangerous() {
        return dangerous;
    }
}