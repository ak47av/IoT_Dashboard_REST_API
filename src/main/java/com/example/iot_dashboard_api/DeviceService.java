package com.example.iot_dashboard_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Device getDeviceById(Long id) {
        Optional<Device> optionalDevice = deviceRepository.findById(id);
        return optionalDevice.orElse(null);
    }

    public Device createDevice(Device device) {
        // Add any validation or business logic here
        return deviceRepository.save(device);
    }

    public Device updateDevice(Long id, Device device) {
        // Add any validation or business logic here
        device.setId(id); // Ensure the ID is set to update the correct device
        return deviceRepository.save(device);
    }

    public void deleteDevice(Long id) {
        // Add any validation or business logic here
        deviceRepository.deleteById(id);
    }
}
