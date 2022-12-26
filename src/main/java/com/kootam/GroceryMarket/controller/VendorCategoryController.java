package com.kootam.GroceryMarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kootam.GroceryMarket.dao.VendorCategoryDAO;
import com.kootam.GroceryMarket.model.VendorCategory;

@Controller
@RequestMapping("/vendorCategory")
public class VendorCategoryController {

	@Autowired
	private VendorCategoryDAO venCategoryDAO;
	
	/*
	 * Vendor Category 
	 * All CREATE methods
	 * *****************************
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveVendorCategory(VendorCategory venCategory) {
		venCategoryDAO.save(venCategory);
		return "";
	}
	
	/*
	 * Vendor Category
	 * All UPDATE methods
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateVendorCategory(VendorCategory venCategory) {
		venCategoryDAO.save(venCategory);
		return "";
	}
	
	/*
	 * Vendor Category
	 * All READ methods
	 */
	@RequestMapping(value = "/getAllVendorCategory", method = RequestMethod.GET)
	public String getAllVendorCategory(Model model) {
		List<VendorCategory> vendorCategories = venCategoryDAO.findAll();
		model.addAttribute("vendorCategories", vendorCategories);
		return "";
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public String getVendorCategory(@PathVariable long id,Model model) {
		VendorCategory venCategory = venCategoryDAO.getReferenceById(id);
		model.addAttribute("venCategory", venCategory);
		return "";
	}
	
	/*
	 * Vendor Category
	 * All DELETE methods
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteVendorCategory(@PathVariable long id) {
		venCategoryDAO.deleteById(id);
		return "";
	}
}