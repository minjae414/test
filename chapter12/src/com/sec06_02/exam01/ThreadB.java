package com.sec06_02.exam01;

public class ThreadB extends Thread {	//������ ���� �纸 ����
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//stop�� true�� �Ǹ� while�� ����
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
