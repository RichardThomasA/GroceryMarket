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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ve_id")
	private Long vendorId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	//@Column(name = "addr_id")
	private Address address;
	@ManyToOne
	@JoinColumn(name = "v_cat_id", nullable = false)
	//@Column(name = "v_cat_id")
	private VendorCategory vendorCategory;
	
	@Column(name = "ve_name")
	private String vendorName;
	
	@Column(name = "ve_password")
	private String vendorPassword;
	
	@Column(name = "ve_usertype")
	private String vendorUserType;
}
