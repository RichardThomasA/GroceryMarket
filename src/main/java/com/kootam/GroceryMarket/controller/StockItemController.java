package com.kootam.GroceryMarket.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kootam.GroceryMarket.model.StockItem;

@Controller
@RequestMapping("/StockItem")
public class StockItemController {

	@GetMapping("/addStockItem")
	public String addStockItem() {
		return "/Stock/AddStock";
	}
	
	@GetMapping(value = "/UnitOfQuantity")
	public ResponseEntity<Map<String,String>> getUnitOfQuantity() {
		Map<String,String> unitOfQuantities = new HashMap<String,String>();
		unitOfQuantities.put(StockItem.ITEM_GRAM,StockItem.ITEM_GRAM);
		unitOfQuantities.put(StockItem.ITEM_KG,StockItem.ITEM_KG);
		unitOfQuantities.put(StockItem.ITEM_NOS,StockItem.ITEM_NOS);
		return ResponseEntity.ok(unitOfQuantities);
	}
}
