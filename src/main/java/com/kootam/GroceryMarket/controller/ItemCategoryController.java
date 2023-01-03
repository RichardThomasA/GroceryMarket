package com.kootam.GroceryMarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kootam.GroceryMarket.dao.ItemCategoryDAO;
import com.kootam.GroceryMarket.model.ItemCategory;

@Controller
@RequestMapping("/itemCategory")
public class ItemCategoryController {
	
	@Autowired
	ItemCategoryDAO itemCategoryDAO;

	@GetMapping("/")
	public ResponseEntity<List<ItemCategory>> getItemCategoryAsJSON() {

		List<ItemCategory> itemCategories = itemCategoryDAO.findAll();
		if(itemCategories!=null) {
			return ResponseEntity.ok(itemCategories);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
