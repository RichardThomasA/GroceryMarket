package com.kootam.GroceryMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StockItem")
public class StockItemController {

	@GetMapping("/addStockItem")
	public String addStockItem() {
		return "/Stock/AddStock";
	}
}
