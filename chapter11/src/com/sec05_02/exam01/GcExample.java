package com.sec05_02.exam01;

public class GcExample {	//gc 메소드 
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);	//쓰레기가 됨
		emp = null;
		emp = new Employee(2);	//쓰레기가 됨
		emp = new Employee(3);
		
		System.out.println("emp가 최정적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();
	}
}
