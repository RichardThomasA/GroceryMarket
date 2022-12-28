package com.kootam.GroceryMarket.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kootam.GroceryMarket.model.Vendor;

@Controller
@RequestMapping("/Vendor")
public class VendorController {

	@PostMapping(value ="/")
	public String addVendor(Vendor vendor) {
		return "";
	}
	@GetMapping(value = "/UserTypes")
	public ResponseEntity<Map<String,String>> getVendorUserTypes() {
		Map<String,String> userTypes = new HashMap<String,String>();
		userTypes.put(Vendor.USERTYPE_INDIVIDUAL, Vendor.USERTYPE_INDIVIDUAL);
		userTypes.put(Vendor.USERTYPE_ORGANISATION, Vendor.USERTYPE_ORGANISATION);
		return ResponseEntity.ok(userTypes);
	}
}
