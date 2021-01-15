package com.sec06_05.exam01;

public class PrintThread1 extends Thread {	//무한 반복해서 출력하는 스레드
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		//stop이 true가 될 때
		while(!stop) {
			System.out.println("실행 중");
		}
		//
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
