package com.sec05_02.exam01;

public class GcExample {	//gc �޼ҵ� 
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);	//�����Ⱑ ��
		emp = null;
		emp = new Employee(2);	//�����Ⱑ ��
		emp = new Employee(3);
		
		System.out.println("emp�� ���������� �����ϴ� �����ȣ: ");
		System.out.println(emp.eno);
		System.gc();
	}
}
