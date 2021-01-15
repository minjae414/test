package com.sec06_02.exam01;

public class ThreadB extends Thread {	//스레드 실행 양보 예제
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}
