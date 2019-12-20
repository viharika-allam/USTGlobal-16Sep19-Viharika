package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Order_Info;
import com.ustglobal.stockmanagement.dto.Products_Info;

public interface StockService {
	public Products_Info addProduct(Products_Info productInfo);
	public boolean modifyProduct(Products_Info productInfo);
	public List<Products_Info> getAllProducts();
	public Order_Info addProductToCart(Order_Info orderInfo);
	public List<Products_Info> search(String searchKey);

}
