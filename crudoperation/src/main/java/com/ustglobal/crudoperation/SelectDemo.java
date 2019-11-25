package com.ustglobal.crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.crudoperation.dto.Pro;

public class SelectDemo {
	
	public static void main(String[] args) {
		EntityManager entityManager = null;
		
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			Pro productDetail =entityManager.find(Pro.class, 1);
			System.out.println("Id---"+productDetail.getId());
			System.out.println("Name--"+productDetail.getName());
			System.out.println("Quantity--"+productDetail.getQuantity());
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
