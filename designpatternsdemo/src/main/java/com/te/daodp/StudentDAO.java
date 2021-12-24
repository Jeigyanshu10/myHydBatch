package com.te.daodp;

import com.te.designpatternsdemo.Student;

public interface StudentDAO {

	void addStudent(Student std);

	Student getStudent(int id);

	void deleteStudent(int id);

}
