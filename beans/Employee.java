package com.cg.empmgt.beans;

public class Employee {
	private int id;
	private String name;
	private String department;

	public Employee(/* int id, */String name, String department) {
		// this.setId(id);
		this.setName(name);
		this.setDepartment(department);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
