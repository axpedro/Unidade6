package com.cruzeiro.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cruzeiro.entity.Student;

public class StudentSelectById {

	public static void main_(String args[]) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 1;
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("\n\nSelect the register by ID: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			System.out.println("Data: " + myStudent);
			
			session.getTransaction().commit();
			
			
		}
		
		
		finally {factory.close();
		}
	}
	
	
}
