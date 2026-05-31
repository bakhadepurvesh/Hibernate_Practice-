package com.soft_repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.soft_entity.Students;
import com.soft_utility.HibernateUtility;

public class Crud_Logic {

	public void printData() {
		
		
		// insert the single data
		
//		 Students stu = new Students();
//		stu.setName("ram");
//		stu.setEmail("ram@gmail.com");
//		stu.setCourse("java");
//		stu.setMarks(80);
		
		
		
	    SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
	    
	    
	    Session session = sessionFactory.openSession();
	    
	    
	    Transaction tran = session.beginTransaction();
	    
//	    session.persist(stu);
	    
	    tran.commit();
	    
	    session.close();
	    	
	}
	
}
