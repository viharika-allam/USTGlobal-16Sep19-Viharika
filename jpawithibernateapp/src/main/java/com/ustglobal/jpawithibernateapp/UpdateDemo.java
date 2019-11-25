package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class UpdateDemo {
	
	public static void main(String[] args) {
	
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			 entityManager = entityManagerFactory.createEntityManager();
			entityTransaction  =entityManager.getTransaction();
			entityTransaction.begin();
			Product product =entityManager.find(Product.class, 101);
			product.setPname("Mobile");
			System.out.println("Update Record");
			entityTransaction.commit();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
	}

}
