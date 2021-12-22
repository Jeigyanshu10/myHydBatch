package com.te.many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.setEid(983);
		emp1.setName("Jeigyanshu");

		emp2.setEid(321);
		emp2.setName("Gangadhar");

		Projects project1 = new Projects();
		Projects project2 = new Projects();
		Projects project3 = new Projects();

		project1.setPid(2123);
		project1.setProjectName("JavaFull Stack");

		project2.setPid(4223);
		project2.setProjectName("Mean Stack");

		project3.setPid(1231);
		project3.setProjectName("Mern Stack");

		List<Employee> empList = new ArrayList<Employee>();
		List<Projects> proList = new ArrayList<Projects>();

		empList.add(emp1);
		empList.add(emp2);

		proList.add(project1);
		proList.add(project1);

		emp1.setProjects(proList);
		project1.setEmp(empList);
		project3.setEmp(empList);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(project1);
		session.save(project2);
		session.save(project3);
		transaction.commit();
		session.close();

	}

}
