package com.sec02_03.exam01;

public class ThreadA extends Thread {	//ThreadA Ŭ����
	public ThreadA() {
		setName("ThreadA");	//������ �̸� ����
	}
	
	public void run() {
		//ThreadA ���� ����
		for(int i = 0; i < 2; i++) {
			System.out.println(getName()/*������ �̸� ���*/ + "�� ����� ����");
		}
	}
}
