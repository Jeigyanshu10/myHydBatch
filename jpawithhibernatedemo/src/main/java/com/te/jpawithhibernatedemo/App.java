package com.te.jpawithhibernatedemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		Tenants donald_tenant = new Tenants();
		Tenants prudhvi_tenant = new Tenants();
		Room room101 = new Room();
		donald_tenant.setAadharNumber(123456789);
		donald_tenant.setGender("Male");
		donald_tenant.setName("Mr. Matta");
		donald_tenant.setMob(987654321);
		donald_tenant.setRoom(room101);

		prudhvi_tenant.setAadharNumber(987654321);
		prudhvi_tenant.setGender("Male");
		prudhvi_tenant.setName("Prudhvi");
		prudhvi_tenant.setMob(768234980);
		prudhvi_tenant.setRoom(room101);

		List<Tenants> tenantList = new ArrayList<Tenants>();
		tenantList.add(donald_tenant);
		tenantList.add(prudhvi_tenant);

		room101.setRoomNumber(101);
		room101.setAc("Voltas");
		room101.setLights(0);
		room101.setBeds("King Size");
		room101.setTenants(tenantList);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Balaya_Hostels");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(room101);
		manager.persist(donald_tenant);
		manager.persist(prudhvi_tenant);
		manager.getTransaction().commit();

		manager.close();
	}
}
