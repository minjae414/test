package com.sec05_01.exam01;

public class ThreadStateExample {	//���� Ŭ����
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
