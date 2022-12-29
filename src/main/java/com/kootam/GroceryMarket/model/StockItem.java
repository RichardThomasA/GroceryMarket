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
@Table(name="stock_items")
public class StockItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sti_id")
	private Long stockItemId;
	
	@ManyToOne
	@JoinColumn(name = "st_id")
	private Stock stock;
	
	@ManyToOne
	@JoinColumn(name = "it_id")
	private Item item;
	
	@ManyToOne
	@JoinColumn(name = "pvap_id")
	private VendorQuotedPrice vendorQuotedPrice;
	
	@ManyToOne
	@JoinColumn(name = "prp_id")
	private ProductRetailPrice productRetailPrice;
	
	@Column(name = "quantity")
	private Long quantity;
	
	@Column(name = "unit_of_quantity")
	private String unitOfQuantity;

	public StockItem() {
		super();
	}

	public StockItem(Stock stock, Item item, VendorQuotedPrice vendorQuotedPrice, ProductRetailPrice productRetailPrice,
			Long quantity, String unitOfQuantity) {
		super();
		this.stock = stock;
		this.item = item;
		this.vendorQuotedPrice = vendorQuotedPrice;
		this.productRetailPrice = productRetailPrice;
		this.quantity = quantity;
		this.unitOfQuantity = unitOfQuantity;
	}

	public Long getStockItemId() {
		return stockItemId;
	}

	public void setStockItemId(Long stockItemId) {
		this.stockItemId = stockItemId;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public VendorQuotedPrice getVendorQuotedPrice() {
		return vendorQuotedPrice;
	}

	public void setVendorQuotedPrice(VendorQuotedPrice vendorQuotedPrice) {
		this.vendorQuotedPrice = vendorQuotedPrice;
	}

	public ProductRetailPrice getProductRetailPrice() {
		return productRetailPrice;
	}

	public void setProductRetailPrice(ProductRetailPrice productRetailPrice) {
		this.productRetailPrice = productRetailPrice;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getUnitOfQuantity() {
		return unitOfQuantity;
	}

	public void setUnitOfQuantity(String unitOfQuantity) {
		this.unitOfQuantity = unitOfQuantity;
	}
	
	
}
