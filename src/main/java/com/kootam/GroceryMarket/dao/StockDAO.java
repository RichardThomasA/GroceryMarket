package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.Stock;

public interface StockDAO extends JpaRepository<Stock,Long>{

}
