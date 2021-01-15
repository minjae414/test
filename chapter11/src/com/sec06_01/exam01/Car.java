package com.sec06_01.exam01;

public class Car {
	public String owner;
	public String model;
	
	public Car(){}
	public Car(String owner, String model) {
		setOwner(owner);
		setModel(model);
	}
	
	public String getOnwer() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
}
