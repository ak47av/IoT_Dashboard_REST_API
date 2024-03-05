package com.example.iot_dashboard_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MetricService {
    @Autowired
    private MetricRepository metricRepository;

    public List<Metric> getAllMetrics() {
        return metricRepository.findAll();
    }

    public Metric getMetricById(Long id) {
        Optional<Metric> optionalMetric = metricRepository.findById(id);
        return optionalMetric.orElse(null);
    }

    public Metric createMetric(Metric metric) {
        // Add any validation or business logic here
        return metricRepository.save(metric);
    }

    public Metric updateMetric(Long id, Metric metric) {
        // Add any validation or business logic here
        metric.setId(id); // Ensure the ID is set to update the correct metric
        return metricRepository.save(metric);
    }

    public void deleteMetric(Long id) {
        // Add any validation or business logic here
        metricRepository.deleteById(id);
    }
}
