package com.te.designpatternsdemo;

import com.te.daodp.StudentDAO;
import com.te.daodp.StudentDAOImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Student std = new Student();
//		std.setSid(1);
//		std.setName("Jeigyanshu");
//		std.setAge(45);
//		std.setAddress("Hyderabad");
		StudentDAO stdDao = new StudentDAOImpl();
//		stdDao.addStudent(std);

//		System.out.println(stdDao.getStudent(1).getSid());
//		System.out.println(stdDao.getStudent(1).getName());
//		System.out.println(stdDao.getStudent(1).getAge());
//		System.out.println(stdDao.getStudent(1).getAddress());

		stdDao.deleteStudent(1);

	}
}
