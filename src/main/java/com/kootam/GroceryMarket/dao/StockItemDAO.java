package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.StockItem;

public interface StockItemDAO extends JpaRepository<StockItem,Long>{

}
