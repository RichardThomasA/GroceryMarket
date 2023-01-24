package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kootam.GroceryMarket.model.ProductPriceMarkup;

public interface ProductPriceMarkupDAO extends JpaRepository<ProductPriceMarkup,Long>{

	@Query(
			value = "select * from product_price_markup order by date_of_insertion desc limit 1",
			nativeQuery = true)
	public ProductPriceMarkup getLatestPPM();
}
