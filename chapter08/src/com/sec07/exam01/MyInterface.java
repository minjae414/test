package com.sec07.exam01;

public interface MyInterface {	//���� �������̽�
	public void method1();
	
	//���� �������̽��� ���ο� ����Ʈ �޼ҵ� �߰�
	public default void method2() {
		System.out.println("MyInterface-method2() ����");
	}
}
