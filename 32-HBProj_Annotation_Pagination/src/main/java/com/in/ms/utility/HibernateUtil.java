package com.in.ms.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	static {
		//create Configuration object
		Configuration cfg = new Configuration();

		// Configure cfg file
		cfg.configure("com/in/ms/cfgs/hibernate.cfg.xml");

		// create SessionFactory object
		factory = cfg.buildSessionFactory();
	}
	//static factory mth for SessionFactory obj
	public static SessionFactory getSessionFactory() {
		return factory;
	}

	//static factory method for Session object
	public static Session getSession() {
		Session ses = null;
		if(factory!=null) {
			ses= factory.openSession();
		}
		return ses;
	}

}
