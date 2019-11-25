package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithibernateapp.onetomany.PencilBox;

public class TestOneToMany { 
	
	
	public static void main(String[] args) {
		PencilBox pb = new PencilBox();
		pb.setBid(2);
		pb.setBname("Natraj");
		
		
		Pencil p = new Pencil();
		p.setPid(19);
		p.setColor("black");
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(20);
		p1.setColor("black");
		p1.setPencilBox(pb);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(p);
		entityManager.persist(p1);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
	}


}
