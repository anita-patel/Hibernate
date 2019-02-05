package com.learning.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	
	static{
		if(sessionfactory==null)	
		{
			Configuration config=new Configuration().configure();
			sessionfactory=config.buildSessionFactory();
		}
	}
	
}
