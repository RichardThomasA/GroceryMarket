package com.kootam.GroceryMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stock_category")
public class StockCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_cat_id")
	private Long stockCategoryId;
	
	@Column(name = "s_cat_name")
	private String stockCategoryName;

	public StockCategory() {
		super();
	}

	public StockCategory(String stockCategoryName) {
		super();
		this.stockCategoryName = stockCategoryName;
	}

	public Long getStockCategoryId() {
		return stockCategoryId;
	}

	public void setStockCategoryId(Long stockCategoryId) {
		this.stockCategoryId = stockCategoryId;
	}

	public String getStockCategoryName() {
		return stockCategoryName;
	}

	public void setStockCategoryName(String stockCategoryName) {
		this.stockCategoryName = stockCategoryName;
	}
	
	
}
