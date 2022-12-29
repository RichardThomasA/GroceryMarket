package com.kootam.GroceryMarket.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendor_category")
public class VendorCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "v_cat_id")
	private Long vendorCategoryId;
	
	@Column(name = "v_cat_name")
	private String vendorCategoryName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Vendor> vendorSet;
	
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
