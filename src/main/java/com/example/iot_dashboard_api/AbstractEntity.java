package com.example.iot_dashboard_api;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.apache.commons.validator.routines.DomainValidator;
import org.apache.commons.validator.routines.InetAddressValidator;


@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String location;
    private String mqttTopic;
    private String mqttHostname;

    // Getters and setters for common fields
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
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMqttTopic() {
        return mqttTopic;
    }

    public void setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    public String getMqttHostname() {
        return mqttHostname;
    }

    public void setMqttHostname(String mqttHostname) {
        InetAddressValidator Ivalidator = InetAddressValidator.getInstance();
        DomainValidator Dvalidator = DomainValidator.getInstance();
        if (Ivalidator.isValid(mqttHostname) || Dvalidator.isValid(mqttHostname)) {
            this.mqttHostname = mqttHostname;
        } else {
            throw new IllegalArgumentException("Invalid MQTT hostname");
        }
    }
}
