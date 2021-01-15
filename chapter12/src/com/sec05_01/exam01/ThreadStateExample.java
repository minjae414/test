package com.sec05_01.exam01;

public class ThreadStateExample {	//실행 클래스
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
