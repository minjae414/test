package com.sec06_05.exam01;

public class PrintThread1 extends Thread {	//���� �ݺ��ؼ� ����ϴ� ������
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		//stop�� true�� �� ��
		while(!stop) {
			System.out.println("���� ��");
		}
		//
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
