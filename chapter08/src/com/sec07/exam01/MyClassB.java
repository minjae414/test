package com.sec07.exam01;

public class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() ����");
	}
	
	@Override
	public void method2() {	//����Ʈ �޼ҵ� ������
		System.out.println("MyClassB-method2() ����");
	}
}
