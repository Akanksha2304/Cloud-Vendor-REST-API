package com.example.demo.repository;

import com.example.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepositiory extends JpaRepository<CloudVendor, String> {

}
