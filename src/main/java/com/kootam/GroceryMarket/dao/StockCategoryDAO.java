package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.ItemCategory;

public interface StockCategoryDAO extends JpaRepository<ItemCategory,Long>{

}
