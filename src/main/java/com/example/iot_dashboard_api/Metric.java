package com.example.iot_dashboard_api;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "metric")
public class Metric extends  AbstractEntity{

    private double value;
    private LocalDateTime timestamp;

    public Metric() {
        this.timestamp = LocalDateTime.now();
    }

    public Metric(String name, double value, String location, String mqttTopic, String mqttHostname) {
        this.setName(name);
        this.value = value;
        this.timestamp = LocalDateTime.now();
        this.setLocation(location);
        this.setMqttTopic(mqttTopic);
        this.setMqttHostname(mqttHostname);
    }

    // Getters and Setters
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
