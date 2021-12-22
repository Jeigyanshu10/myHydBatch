package com.te.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDataUsingHibernate {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		SuperVillains sv = session.get(SuperVillains.class, 2);
		System.out.println(sv);
//		SuperVillains svg = session.get(SuperVillains.class, );
//		System.out.println(svg);
		SuperVillains svl = session.load(SuperVillains.class, 3);
		System.out.println(svl);
		SuperVillains svll = session.load(SuperVillains.class, 1);
		System.out.println(svll);
	}

}