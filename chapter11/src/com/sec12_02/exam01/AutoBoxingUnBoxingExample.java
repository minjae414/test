package com.sec12_02.exam01;

public class AutoBoxingUnBoxingExample {	//�ڵ� �ڽ̰� ��ڽ�
	public static void main(String[] args) {
		//�ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: "+ obj.intValue());
		
		//���� �� �ڵ� Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
