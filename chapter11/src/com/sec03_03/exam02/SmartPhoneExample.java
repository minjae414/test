package com.sec03_03.exam02;

public class SmartPhoneExample {	//��ü�� ���� ����(toString() �޼ҵ�)
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		//myPhone.toString()�� �ڵ�ȣ���ؼ� ���ϰ��� ���� �� ���
		System.out.println(myPhone);	
	}
}
