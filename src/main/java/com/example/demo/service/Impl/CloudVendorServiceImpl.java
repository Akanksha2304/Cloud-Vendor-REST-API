package com.example.demo.service.Impl;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepositiory;
import com.example.demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepositiory cloudVendorRepositiory;
    public CloudVendorServiceImpl(CloudVendorRepositiory cloudVendorRepositiory) {
        this.cloudVendorRepositiory = cloudVendorRepositiory;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepositiory.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepositiory.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepositiory.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId){
        return cloudVendorRepositiory.findById(cloudVendorId).orElse(null);
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepositiory.findAll();
    }
}
