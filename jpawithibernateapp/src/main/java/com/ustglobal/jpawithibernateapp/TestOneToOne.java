package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithibernateapp.onetoone.dto.Person;
import com.ustglobal.jpawithibernateapp.onetoone.dto.VoterCard;

import lombok.Data;

public class TestOneToOne {
	
	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("ram");
		
		Person p = new Person();
		p.setPid(1);
		p.setPname("ram");
		p.setVoterCard(vc);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		//entityManager.persist(p);one direction
		VoterCard vCard = entityManager.find(VoterCard.class, 10);
		System.out.println(vCard.getPerson().getPid());
		
		System.out.println("Record Saved");
		
		entityTransaction.commit();
		entityManager.close();
	}


}
