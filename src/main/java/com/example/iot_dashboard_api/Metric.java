package com.example.iot_dashboard_api;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "metric")
public class Metric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double value;
    private LocalDateTime timestamp;

    // Constructors, Getters, and Setters

    public Metric() {
        this.timestamp = LocalDateTime.now();
    }

    public Metric(String name, double value) {
        this.name = name;
        this.value = value;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
