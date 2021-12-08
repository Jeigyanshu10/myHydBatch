package com.technoelevate.myjava8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyMain {

	public static void main(String[] args) {

		ArrayList<Student> stu = new ArrayList();
		stu.add(new Student(104, "Sai"));
		stu.add(new Student(111, "Bindu"));
		stu.add(new Student(101, "Vijay"));
		stu.add(new Student(110, "Teja"));
		stu.add(new Student(123, "Ravinder"));

		Collections.sort(stu, (Comparator<Student>) (Student stu1, Student stu2) -> {
			return stu1.getRollno().compareTo(stu2.getRollno());
		});

		for (Student st : stu) {
			System.out.println(st);
		}

	}

}
