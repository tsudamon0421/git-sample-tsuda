package com.example.domain;

public class Employee {
	
	private String name;
	private Integer age;
	private Integer depId;
		
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", depId=" + depId + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDepId() {
		return depId;
	}
	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	
	

}
