package com.example.iot_dashboard_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
    // You can add custom query methods here if needed
}
