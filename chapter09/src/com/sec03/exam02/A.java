package com.sec03.exam02;

public class A {	//��� Ŭ�������� ��� ����
	int field1;	
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {	//��� �ʵ�� �޼ҵ忡 ������ �� �ִ�.
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {	//�ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ����.
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
