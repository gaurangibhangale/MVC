package com.dao;


import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Movie;

public class Moviedao {

	public boolean addMovie()
	{
		Movie movie=new Movie();
		
		movie.setDirector("Christopher Nolan");
		movie.setMovieid(3);
		movie.setName("Inception");
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
		
		return false;
		
	}
	
	public void listMovies( ){

		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List movielist = session.createQuery("FROM Movie").list(); 
	         for (Iterator iterator = movielist.iterator(); iterator.hasNext();){
	            Movie movie = (Movie) iterator.next(); 
	            System.out.print("Movie Name: " + movie.getName()); 
	           
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
}
