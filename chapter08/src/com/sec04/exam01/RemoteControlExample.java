package com.sec04.exam01;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;	//�������̽� ���� ����
		
		rc = new Television();	//Television ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();	//�������̽��� turnOn(), turnOff() ȣ��
		rc.turnOff();
		
		rc = new Audio();	//Audio ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();	//�������̽��� turnOn(), turnOff() ȣ��
		rc.turnOff();
	}
}
