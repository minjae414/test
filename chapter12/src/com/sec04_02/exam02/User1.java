package com.sec04_02.exam02;

public class User1 extends Thread {	//User1 ������
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");	//������ �̸��� User1�� ����
		this.calculator = calculator;	//���� ��ü�� Calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calculator.setMemory(100);	//���� ��ü�� Calculator�� �޸𸮿� 100�� ����
	}
}
