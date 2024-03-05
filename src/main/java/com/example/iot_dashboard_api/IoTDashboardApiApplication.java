package com.example.iot_dashboard_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.iot_dashboard_api"})
@EntityScan(basePackages ={"com.example.iot_dashboard_api"})
public class IoTDashboardApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(IoTDashboardApiApplication.class, args);
    }

}

