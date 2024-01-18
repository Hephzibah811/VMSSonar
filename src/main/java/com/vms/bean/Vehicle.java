package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@Column(name="vehid")
	private int id;
	
	@Column(name="vehname")
	private String name;
	
	@Column(name="vehnum")
	private String number;
	
	@Column(name="vehtype")
	private String type;
	
	@Column(name="vehowner")
	private String owner;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id, String name, String number, String type, String owner) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.type = type;
		this.owner = owner;
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

	public String getNumber() {
		return number;
	}

	public void setNum(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", number=" + number + ", type=" + type + ", owner=" + owner + "]";
	}
	
	
}