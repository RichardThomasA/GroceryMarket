package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.VendorCategory;

public interface VendorCategoryDAO extends JpaRepository<VendorCategory, Long>{

}
