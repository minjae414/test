package com.sec05.exam05;

public class Driver {	//��ü Ÿ�� Ȯ��
	public void drive(Vehicle vehicle) {	//Bus, Taxi ��ü
		if(vehicle instanceof Bus) {	//vehicle �Ű� ������ �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle;	//Bus ��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ��Ŵ
			bus.checkFare();	//Bus Ÿ������ ���� Ÿ�� ��ȯ�� �ϴ� ����
		}
		vehicle.run();
	}
}
