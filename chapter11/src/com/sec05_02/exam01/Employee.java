package com.sec05_02.exam01;

public class Employee{
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ������.");
	}
	
	//�Ҹ���
	@Override
	public void finalize() throws Throwable {
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�.");
	}
}