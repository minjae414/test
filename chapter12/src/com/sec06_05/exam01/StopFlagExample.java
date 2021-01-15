package com.sec06_05.exam01;

public class StopFlagExample {	//1초 후 출력 스레드를 중지시킴
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		printThread.setStop(true);	//스레드를 종료시키기 위해 stop 필드를 true로 변경
	}
}
