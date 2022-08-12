package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Products;
public class ProductsDao {
	public int addProducts(Products prod) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			
			Transaction tran = session.getTransaction();
			tran.begin();
			session.save(prod);
			tran.commit();
			return 1;
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
	
		}
	}

}