package com.sec03.exam01;

public class TryCatchFinallyExample {	//�Ϲ� ���� ó��
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
