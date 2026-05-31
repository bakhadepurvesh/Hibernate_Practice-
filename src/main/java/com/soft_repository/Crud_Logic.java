package com.soft_repository;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.soft_entity.Students;
import com.soft_utility.HibernateUtility;

public class Crud_Logic {

	public void printData() {
		
		
		// insert the single data
		
		Students stu = new Students();
		stu.setName("ramesh");
		stu.setEmail("ramesh@gmail.com");
		stu.setCourse("html");
		stu.setMarks(85);
		
		Students stu1 = new Students();
		stu1.setName("sita");
		stu1.setEmail("sita@gmail.com");
		stu1.setCourse("c++");
		stu1.setMarks(70);
		
		Students stu2 = new Students();
		stu2.setName("sita");
		stu2.setEmail("sita@gmail.com");
		stu2.setCourse("c++");
		stu2.setMarks(70);
		
		
		ArrayList<Students>list = new ArrayList();
		
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		
		
	    SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
	    
	    Session session = sessionFactory.openSession();
	    
	    Transaction tran = session.beginTransaction();
	    
//		insert the single data
//	    session.persist(stu);
	    
	    // multiple data insert 
	    for(Students std : list){
			session.persist(std);
		}
	    
	    tran.commit();
	    
	    session.close();
	    	
	}
	
}
