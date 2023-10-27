package com.inherit;

public class Employee {
	private int id;
	private String name;
	private Address addr;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public void show() {
		System.out.println(id + " " + name);
		System.out.println(addr);
	}

}
