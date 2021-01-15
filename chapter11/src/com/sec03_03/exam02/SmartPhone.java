package com.sec03_03.exam02;

public class SmartPhone {	//객체의 문자 정보(toString() 메소드)
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//toString() 재정의
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
