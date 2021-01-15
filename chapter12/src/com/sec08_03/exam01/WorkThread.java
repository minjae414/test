package com.sec08_03.exam01;

public class WorkThread extends Thread {	//InterruptedException�� �߻��� �� �����尡 ����ǵ��� ��
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);	//������ �׷�� ������ �̸��� ����
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(getName() + " Interrupted");
				break;
			}
		}
		System.out.println(getName() + " �����");
	}
}
