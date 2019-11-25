package com.ustglobal.crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.crudoperation.dto.Pro;

public class InsertDemo {
	
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {
			Pro pro = new Pro();
			pro.setId(1);
			pro.setName("Bag");
			pro.setQuantity(10);
			
			
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pro);
			System.out.println("Record Saved");
			entityTransaction.commit();
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}

}
