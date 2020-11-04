package com.Workers.create;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Workers.create.db.CrtWorkers;


public class createWorkers {
	
	public static void main (String args[])
	{
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("WORKERS_DETAILS");  
	     EntityManager em=emf.createEntityManager();  
	     em.getTransaction().begin();
	     
	     CrtWorkers w1= new CrtWorkers();
	     w1.setid(5);
	     w1.setname("KESHAV");
	     
	     CrtWorkers w2= new CrtWorkers();
	     w2.setid(4);
	     w2.setname("RAHUL");
	     
	     em.persist(w1);  
	     em.persist(w2);  
	     
	     em.getTransaction().commit();  
         
	     System.out.println("TABLE CREATED AND VALUES ENTERED");
	     emf.close();  
	   //  em.close();  
	           
	}

}
