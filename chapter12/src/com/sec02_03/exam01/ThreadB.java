package com.sec02_03.exam01;

public class ThreadB extends Thread {	//ThreadB Ŭ����
	public void run() {
		//ThreadB ���� ����
		for(int i = 0; i < 2; i++) {
			System.out.println(getName()/*������ �̸� ���*/ + "�� ����� ����");
		}
	}
}
