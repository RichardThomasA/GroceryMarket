package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.StockCategory;

public interface StockCategoryDAO extends JpaRepository<StockCategory,Long>{

}
