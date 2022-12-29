package com.kootam.GroceryMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product_retailing_price")
public class ProductRetailPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prp_id")
	private Long retailPriceId;
	
	@ManyToOne
	@JoinColumn(name = "it_id")
	private Item item;
	
	@Column(name = "prp_price")
	private Float retailPrice;

	public ProductRetailPrice() {
		super();
	}

	public ProductRetailPrice(Item item, Float retailPrice) {
		super();
		this.item = item;
		this.retailPrice = retailPrice;
	}

	public Long getRetailPriceId() {
		return retailPriceId;
	}

	public void setRetailPriceId(Long retailPriceId) {
		this.retailPriceId = retailPriceId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Float getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Float retailPrice) {
		this.retailPrice = retailPrice;
	}
	
	
}
