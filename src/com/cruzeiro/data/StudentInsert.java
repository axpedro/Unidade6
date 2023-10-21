package com.cruzeiro.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cruzeiro.entity.Student;

public class StudentInsert {

	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			Student tempStudent = new Student("Unidade","Seis","unidade6@unidade");
			
			session.beginTransaction();
			
			System.out.println("\n\nInsert the register by ID: ");
			session.save(tempStudent);
			
			
			session.getTransaction().commit();
			
			
		}
		
		
		finally {factory.close();
		}
	}
	
	
}
