package com.sec06_05.exam03;

public class PrintThread2 extends Thread {	//���� �ݺ��ؼ� ����ϴ� ������
	public void run() {
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {	//Ȥ�� (new Thread()).isInterrupted();
				break;	//while���� ��������
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
