package com.sec03.exam03;

public class Outter {	//��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			//��ø ��ü ����
			System.out.println(this.field);
			this.method();
			//�ٱ� ��ü ����
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
