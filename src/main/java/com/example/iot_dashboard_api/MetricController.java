package com.example.iot_dashboard_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/metrics")

public class MetricController {

    @Autowired
    private MetricService metricService;

    @GetMapping
    public List<Metric> getMetrics() {
        return metricService.getAllMetrics();
    }

    @GetMapping("/{metricId}")
    public Metric getMetric(@PathVariable Long metricId) {
        return metricService.getMetricById(metricId);
    }

    @PostMapping
    public Metric createMetric(@RequestBody Metric metric) {
        return metricService.createMetric(metric);
    }

    @PutMapping("/{metricId}")
    public Metric updateMetric(@PathVariable Long metricId, @RequestBody Metric metric) {
        return metricService.updateMetric(metricId, metric);
    }

    @DeleteMapping("/{metricId}")
    public void deleteMetric(@PathVariable Long metricId) {
        metricService.deleteMetric(metricId);
    }

}
