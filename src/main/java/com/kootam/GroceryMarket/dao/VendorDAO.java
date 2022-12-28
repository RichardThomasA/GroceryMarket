package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.Vendor;

public interface VendorDAO extends JpaRepository<Vendor, Long>{

}
