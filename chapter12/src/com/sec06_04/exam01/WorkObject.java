package com.sec06_04.exam01;

public class WorkObject {	//�� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();	//�Ͻ� ���� ���¿� �ִ� ThreadB�� ���� ��� ���·� ����
		try {
			wait();	//ThreadA�� �Ͻ� ���� ���·� ����
		} catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();	//�Ͻ� ���� ���¿� �ִ� ThreadA�� ���� ��� ���·� ����
		try {
			wait();	//ThreadB�� �Ͻ� ���� ���·� ����
		} catch(InterruptedException e) {}
	}
}
