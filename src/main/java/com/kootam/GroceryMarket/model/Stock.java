package com.kootam.GroceryMarket.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "st_id")
	private Long stockId;
	
	@ManyToOne
	@JoinColumn(name = "ve_id")
	private Vendor vendor;
	
	@Column(name = "st_invoice_number")
	private String stockInvoiceNumber;
	
	@Column(name = "st_date")
	private LocalDate stockDate;

	public Stock() {
		super();
	}

	public Stock(Vendor vendor, String stockInvoiceNumber, LocalDate stockDate) {
		super();
		this.vendor = vendor;
		this.stockInvoiceNumber = stockInvoiceNumber;
		this.stockDate = stockDate;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getStockInvoiceNumber() {
		return stockInvoiceNumber;
	}

	public void setStockInvoiceNumber(String stockInvoiceNumber) {
		this.stockInvoiceNumber = stockInvoiceNumber;
	}

	public LocalDate getStockDate() {
		return stockDate;
	}

	public void setStockDate(LocalDate stockDate) {
		this.stockDate = stockDate;
	}
	
	
}
