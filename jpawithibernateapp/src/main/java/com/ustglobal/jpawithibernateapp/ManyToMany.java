package com.ustglobal.jpawithibernateapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;
import com.ustglobal.jpawithibernateapp.manytomany.Course;
import com.ustglobal.jpawithibernateapp.manytomany.Student;

public class ManyToMany {
	
	public static void main(String[] args) {
		Course course = new Course();
		course.setCid(10);
		course.setCname("java");
		
		Course course1 = new Course();
		course1.setCid(20);
		course1.setCname("sql");
		
		List<Course> list = new ArrayList<Course>();
		list.add(course1);
		list.add(course);
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("viha");
		student.setCourses(list);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
	}


}
