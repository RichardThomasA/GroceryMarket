package com.kootam.GroceryMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VendorCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "v_cat_id")
	private Long vendorCategoryId;
	
	@Column(name = "v_cat_name")
	private String vendorCategoryName;
	
	public VendorCategory() {
		
	}

	public VendorCategory(Long vendorCategoryId, String vendorCategoryName) {
		super();
		this.vendorCategoryId = vendorCategoryId;
		this.vendorCategoryName = vendorCategoryName;
	}

	public Long getVendorCategoryId() {
		return vendorCategoryId;
	}

	public void setVendorCategoryId(Long vendorCategoryId) {
		this.vendorCategoryId = vendorCategoryId;
	}

	public String getVendorCategoryName() {
		return vendorCategoryName;
	}

	public void setVendorCategoryName(String vendorCategoryName) {
		this.vendorCategoryName = vendorCategoryName;
	}
	
	
	
}
