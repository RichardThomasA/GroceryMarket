package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.Item;

public interface ItemDAO extends JpaRepository<Item, Long>{

}
