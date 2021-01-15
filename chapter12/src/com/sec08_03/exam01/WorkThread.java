package com.sec08_03.exam01;

public class WorkThread extends Thread {	//InterruptedException이 발생할 때 스레드가 종료되도록 함
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);	//스레드 그룹과 스레드 이름을 설정
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
		System.out.println(getName() + " 종료됨");
	}
}
