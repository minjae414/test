package com.sec06_05.exam02;

public class PrintThread2 extends Thread {	//���� �ݺ��ؼ� ����ϴ� ������
	public void run() {
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
