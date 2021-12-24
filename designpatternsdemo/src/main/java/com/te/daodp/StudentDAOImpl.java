package com.te.daodp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.designpatternsdemo.Student;

public class StudentDAOImpl implements StudentDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Student");

	@Override
	public void addStudent(Student std) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(std);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public Student getStudent(int id) {
		EntityManager manager = factory.createEntityManager();
		Student std = manager.find(Student.class, id);
		return std;
	}

	@Override
	public void deleteStudent(int id) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Student std = manager.find(Student.class, id);
		manager.remove(std);
		manager.flush();
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Student removed sucessfully");
	}

}
