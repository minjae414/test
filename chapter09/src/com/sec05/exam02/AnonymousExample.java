package com.sec05.exam02;

public class AnonymousExample {	//�͸� ���� Ŭ������ ��ü ����
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(	//�Ű���
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV�� �մϴ�.");
					}
					@Override
					public void turnOff() {
						System.out.println("SmartTV�� ���ϴ�.");
					}
				}
				);
	}
}
