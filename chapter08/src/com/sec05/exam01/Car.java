package com.sec05.exam01;

public class Car {	//�ʵ� ������
	Tire frontLeftTire = new HankookTire();	//�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {	//�������̽����� ����� roll() �޼ҵ� ȣ��
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
