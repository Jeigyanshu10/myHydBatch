package com.te.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SuperHeros hero = new SuperHeros();
		hero.setSuperId(1);
		hero.setSuperName("IronMan");
		hero.setSuperPower("SuperHuman strength");
		hero.setWeapon("IronSuit");

		SuperVillains villain1 = new SuperVillains();
		villain1.setVillainId(2);
		villain1.setVillainName("Loki");
		villain1.setVillainPower("Mischieve");
		villain1.setWeapon("ArcSeptor");
		// villain1.setHeros(hero);

		SuperVillains villain2 = new SuperVillains();
		villain2.setVillainId(3);
		villain2.setVillainName("Ivan");
		villain2.setVillainPower("Stubbourn");
		villain2.setWeapon("Fake ArcReactor");
		// villain2.setHeros(hero);

		SuperVillains villain3 = new SuperVillains();
		villain3.setVillainId(1);
		villain3.setVillainName("Thanos");
		villain3.setVillainPower("FingerSnap");
		villain3.setWeapon("Gauntlet");
		// villain3.setHeros(hero);

		List<SuperVillains> villainList = new ArrayList<SuperVillains>();
		villainList.add(villain1);
		villainList.add(villain2);
		villainList.add(villain3);

		// hero.setVillains(villainList);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(hero);
		session.save(villain1);
		session.save(villain2);
		session.save(villain3);

		// SuperHeros hero = session.get(SuperHeros.class, 1);
//		System.out.println(hero.getSuperId());
//		System.out.println(hero.getSuperName());
//		System.out.println(hero.getVillains().size());

//		for (SuperVillains villains : hero.getVillains()) {
//			System.out.println(villains.getVillainName());
//		}
		transaction.commit();
		session.close();

	}
}