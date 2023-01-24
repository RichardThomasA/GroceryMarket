package com.kootam.GroceryMarket.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_price_markup")
public class ProductPriceMarkup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ppm_id")
	Long ProductPriceMarkupId;
	
	@Column(name = "percentage")
	float percentage;
	
	@Column(name = "date_of_insertion")
	LocalDate dateOfInsertion;

	public ProductPriceMarkup() {
		super();
	}

	public ProductPriceMarkup(float percentage, LocalDate dateOfInsertion) {
		super();
		this.percentage = percentage;
		this.dateOfInsertion = dateOfInsertion;
	}

	public Long getProductPriceMarkupId() {
		return ProductPriceMarkupId;
	}

	public void setProductPriceMarkupId(Long productPriceMarkupId) {
		ProductPriceMarkupId = productPriceMarkupId;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public LocalDate getDateOfInsertion() {
		return dateOfInsertion;
	}

	public void setDateOfInsertion(LocalDate dateOfInsertion) {
		this.dateOfInsertion = dateOfInsertion;
	}
	
	
}
