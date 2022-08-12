package com.service;
import com.dao.ProductsDao;
import com.bean.Products;

public class ProductsService {
	ProductsDao pd = new ProductsDao();
	
	public String addProducts(Products prod) {
		if(pd.addProducts(prod)>0 ) {
			return "Product stored Successfully";
		}
		else {
			return "Product did not store , id must be unique";
		}
	}

}