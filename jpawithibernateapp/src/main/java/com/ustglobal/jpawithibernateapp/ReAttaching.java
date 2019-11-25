package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReAttaching {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product productDetails =	entityManager.getReference(Product.class, 101);
			
			System.out.println(entityManager.contains(productDetails));
			entityManager.detach(productDetails);
			System.out.println(entityManager.contains(productDetails));
			Product productDetails2 =entityManager.merge(productDetails);
			productDetails2.setPname("doll");
			System.out.println("update");
			entityTransaction.commit();


		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}




}
