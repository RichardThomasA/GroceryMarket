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
@Table(name="product_vendor_actual_price")
public class VendorQuotedPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pvap_id")
	private Long vendorPriceId;
	
	@ManyToOne
	@JoinColumn(name = "it_id")
	private Item item;
	
	@Column(name = "pvap_price")
	private Float vendorPrice;

	public VendorQuotedPrice() {
		super();
	}

	public VendorQuotedPrice(Item item, Float vendorPrice) {
		super();
		this.item = item;
		this.vendorPrice = vendorPrice;
	}

	public Long getVendorPriceId() {
		return vendorPriceId;
	}

	public void setVendorPriceId(Long vendorPriceId) {
		this.vendorPriceId = vendorPriceId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Float getVendorPrice() {
		return vendorPrice;
	}

	public void setVendorPrice(Float vendorPrice) {
		this.vendorPrice = vendorPrice;
	}
	
	
}
