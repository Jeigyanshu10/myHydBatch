package com.te.many2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	private String name;

	@ManyToMany
	private List<Projects> projects;

	public Employee(int eid, String name, List<Projects> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}

	public Employee() {

	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", projects=" + projects + "]";
	}

}
