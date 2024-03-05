package com.example.iot_dashboard_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricRepository extends JpaRepository<Metric, Long>{

}
