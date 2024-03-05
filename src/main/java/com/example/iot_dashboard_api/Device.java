package com.example.iot_dashboard_api;

import jakarta.persistence.*;

@Entity
@Table(name = "device")
public class Device extends AbstractEntity{

    private boolean isOn;

    // Constructors, Getters, and Setters
    public Device() {}

    public Device(String name, boolean isOn, String location, String mqttTopic, String mqttHostname) {
        this.setName(name);
        this.isOn = isOn;
        this.setLocation(location);
        this.setMqttTopic(mqttTopic);
        this.setMqttHostname(mqttHostname);
    }

    // Getters and Setters

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

}
