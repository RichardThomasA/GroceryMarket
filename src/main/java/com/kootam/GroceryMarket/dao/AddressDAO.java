package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kootam.GroceryMarket.model.Address;

public interface AddressDAO extends JpaRepository<Address, Long>{

}
