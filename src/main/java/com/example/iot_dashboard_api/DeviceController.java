package com.example.iot_dashboard_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @GetMapping
    public List<Device> getDevices() {
        return deviceService.getAllDevices();
    }

    @GetMapping("/{deviceId}")
    public Device getDevice(@PathVariable Long deviceId) {
        return deviceService.getDeviceById(deviceId);
    }

    @PostMapping
    public Device createDevice(@RequestBody Device device) {
        return deviceService.createDevice(device);
    }

    @PutMapping("/{deviceId}")
    public Device updateDevice(@PathVariable Long deviceId, @RequestBody Device device) {
        return deviceService.updateDevice(deviceId, device);
    }

    @DeleteMapping("/{deviceId}")
    public void deleteDevice(@PathVariable Long deviceId) {
        deviceService.deleteDevice(deviceId);
    }
}
