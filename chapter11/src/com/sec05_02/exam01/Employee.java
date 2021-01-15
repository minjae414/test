package com.sec05_02.exam01;

public class Employee{
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") 이 메모리에서 생성됨.");
	}
	
	//소멸자
	@Override
	public void finalize() throws Throwable {
		System.out.println("Employee(" + eno + ") 이 메모리에서 제거됨.");
	}
}