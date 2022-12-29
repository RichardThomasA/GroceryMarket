package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.VendorQuotedPrice;

public interface VendorQuotedPriceDAO extends JpaRepository<VendorQuotedPrice,Long>{

}
