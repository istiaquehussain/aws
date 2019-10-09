package com.istiaque.spring.cloud.bootcloud.entity;

public class Employee {
	String id;
	String uid;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", uid=" + uid + ", name=" + name + "]";
	}
	public Employee(String id, String uid, String name) {
		super();
		this.id = id;
		this.uid = uid;
		this.name = name;
	}
	
	
}
