package RESTApi.model;

import javax.persistence.*;

@Entity
@Table(name = "dangerreports")
public class DangerReport {
    @Id
    @Column(name = "timestamp", nullable=false)
    private float timestamp;
    @Column(name = "distance", nullable=false)
    private float distance;
    @Column(name = "object_speed", nullable=false)
    private float objectSpeed;
    @Column(name = "bicycle_speed", nullable=false)
    private float bicycleSpeed;
    @Column(name = "latitude", nullable=false)
    private float latitude;
    @Column(name = "longitude", nullable=false)
    private float longitude;
    @Column(name = "dangerous", nullable=false)
    private boolean dangerous;

    public DangerReport() {
    }

    public DangerReport(float timestamp, float distance,
                        float objectSpeed, float bicycleSpeed,
                        float latitude, float longitude,
                        boolean dangerous) {
        this.timestamp = timestamp;
        this.distance = distance;
        this.objectSpeed = objectSpeed;
        this.bicycleSpeed = bicycleSpeed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dangerous = dangerous;
    }

//other setters and getters

    @Column(name = "timestamp")
    public float getTimestamp() {
        return timestamp;
    }

    @Column(name = "distance")
    public float getDistance() {
        return distance;
    }

    @Column(name = "object_speed")
    public float getObjectSpeed() {
        return objectSpeed;
    }

    @Column(name = "bicycle_speed")
    public float getBicycleSpeed() {
        return bicycleSpeed;
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
    public boolean getDangerous() {
        return dangerous;
    }
}