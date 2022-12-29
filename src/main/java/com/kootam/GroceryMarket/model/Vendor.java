package com.kootam.GroceryMarket.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
	
	public static final String USERTYPE_INDIVIDUAL = "INDIVIDUAL";
	public static final String USERTYPE_ORGANISATION = "ORGANISATION";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ve_id")
	private Long vendorId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	private Address address;
	@ManyToOne
	@JoinColumn(name = "v_cat_id")
	private VendorCategory vendorCategory;
	
	@Column(name = "ve_name")
	private String vendorName;
	
	@Column(name = "ve_password")
	private String vendorPassword;
	
	@Column(name = "ve_usertype")
	private String vendorUserType;

	public Vendor() {
		super();
	}

	public Vendor(Address address, VendorCategory vendorCategory, String vendorName, String vendorPassword,
			String vendorUserType) {
		super();
		this.address = address;
		this.vendorCategory = vendorCategory;
		this.vendorName = vendorName;
		this.vendorPassword = vendorPassword;
		this.vendorUserType = vendorUserType;
	}

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public VendorCategory getVendorCategory() {
		return vendorCategory;
	}

	public void setVendorCategory(VendorCategory vendorCategory) {
		this.vendorCategory = vendorCategory;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorPassword() {
		return vendorPassword;
	}

	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}

	public String getVendorUserType() {
		return vendorUserType;
	}

	public void setVendorUserType(String vendorUserType) {
		this.vendorUserType = vendorUserType;
	}
	
	
}
