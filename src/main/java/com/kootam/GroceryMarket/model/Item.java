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
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "it_id")
	private Long itemId;
	
	@ManyToOne
	@JoinColumn(name = "item_cat_id")
	private ItemCategory itemCategory;
	
	@Column(name = "it_name")
	private String itemName;

	public Item() {
		super();
	}

	public Item(ItemCategory itemCategory, String itemName) {
		super();
		this.itemCategory = itemCategory;
		this.itemName = itemName;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public ItemCategory getStockCategory() {
		return itemCategory;
	}

	public void setStockCategory(ItemCategory itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
