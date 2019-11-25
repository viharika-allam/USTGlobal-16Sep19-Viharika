package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager	entityManager = entityManagerFactory.createEntityManager();
		//Product productInfo =	entityManager.getReference(Product.class, 101);
	Product productInfo =	entityManager.find(Product.class, 101);
	System.out.println(productInfo.getClass());
	System.out.println("Id--"+productInfo.getPid());
	System.out.println("Name-"+productInfo.getPname());
	    System.out.println("Quantity--"+productInfo.getQuantity());
		entityManager.close();
		
		
	}

}
