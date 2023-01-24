package com.kootam.GroceryMarket.controller;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kootam.GroceryMarket.dao.ItemCategoryDAO;
import com.kootam.GroceryMarket.dao.ItemDAO;
import com.kootam.GroceryMarket.dao.ProductPriceMarkupDAO;
import com.kootam.GroceryMarket.dao.ProductRetailPriceDAO;
import com.kootam.GroceryMarket.dao.StockDAO;
import com.kootam.GroceryMarket.dao.StockItemDAO;
import com.kootam.GroceryMarket.dao.VendorDAO;
import com.kootam.GroceryMarket.dao.VendorQuotedPriceDAO;
import com.kootam.GroceryMarket.model.Item;
import com.kootam.GroceryMarket.model.ItemCategory;
import com.kootam.GroceryMarket.model.ProductPriceMarkup;
import com.kootam.GroceryMarket.model.ProductRetailPrice;
import com.kootam.GroceryMarket.model.Stock;
import com.kootam.GroceryMarket.model.StockItem;
import com.kootam.GroceryMarket.model.Vendor;
import com.kootam.GroceryMarket.model.VendorQuotedPrice;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/StockItem")
public class StockItemController {
	
	@Autowired
	ItemCategoryDAO itemCategoryDAO;
	@Autowired
	ItemDAO itemDAO;
	@Autowired
	VendorDAO vendorDAO;
	@Autowired
	StockDAO stockDAO;
	@Autowired
	VendorQuotedPriceDAO vqpDAO;
	@Autowired
	ProductRetailPriceDAO prpDAO;
	@Autowired
	ProductPriceMarkupDAO ppmDAO;
	@Autowired
	StockItemDAO stockItemDAO;

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
	
	@PostMapping("/saveStockItem")
	public void saveStockItem(HttpServletRequest req,HttpServletResponse res) {
		Long itemCategoryId = Long.parseLong(req.getParameter("itemCategory"));
		String itemName = req.getParameter("itemName");
		
		Long vendorId = Long.parseLong(req.getParameter("vendor"));
		String stockInvoiceNumber = req.getParameter("stockInvoiceNumber");
		LocalDate stockDate = LocalDate.parse(req.getParameter("stockDate"));
		
		Long quantity = Long.parseLong(req.getParameter("quantity"));
		String unitOfQuantity = req.getParameter("unitOfQuantity");
		Float vendorPrice = Float.parseFloat(req.getParameter("vendorPrice"));
		
		Item item = new Item();
		ItemCategory itemCategory = itemCategoryDAO.getReferenceById(itemCategoryId);
		item.setStockCategory(itemCategory);
		item.setItemName(itemName);
		item = itemDAO.save(item);

		Vendor vendor = vendorDAO.getReferenceById(vendorId);
		Stock stock = new Stock();
		stock.setStockInvoiceNumber(stockInvoiceNumber);
		stock.setVendor(vendor);
		stock.setStockDate(stockDate);
		stock = stockDAO.save(stock);
		
		VendorQuotedPrice pvap = new VendorQuotedPrice();
		pvap.setItem(item);
		pvap.setVendorPrice(vendorPrice);
		pvap = vqpDAO.save(pvap);
		
		ProductPriceMarkup markup = ppmDAO.getLatestPPM();
		float retailPrice =0.00f;
		if(markup!=null) {
			float percentage =markup.getPercentage()/100;
			DecimalFormat df = new DecimalFormat("0.00");
			retailPrice = Float.parseFloat(df.format(vendorPrice * percentage))+vendorPrice;
		}
		ProductRetailPrice prp = new ProductRetailPrice();
		prp.setItem(item);
		prp.setRetailPrice(retailPrice);
		prp = prpDAO.save(prp);
		
		StockItem stockItem = new StockItem();
		stockItem.setItem(item);
		stockItem.setStock(stock);
		stockItem.setVendorQuotedPrice(pvap);
		stockItem.setProductRetailPrice(prp);
		stockItem.setQuantity(quantity);
		stockItem.setUnitOfQuantity(unitOfQuantity);
		
		stockItemDAO.save(stockItem);
	}
}
