package com.sec05.exam03;

public class DriverExample {	//�Ű� ������ ������ �׽�Ʈ
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	//�ڵ� Ÿ�� ��ȯ: Vehicle vehicle = bus;
		driver.drive(taxi);	//�ڵ� Ÿ�� ��ȯ: Vehicle vehicle = taxi;
	}
}
