package com.sec03_01.exam01;

public class CalcThread extends Thread {	//작업 스레드
	public CalcThread(String name) {
		setName(name);	//스레드 이름 변경
	}
	
	public void run() {
		//스레드가 실행할 내용
		for(int i = 0; i < 2000000000; i++) {}
		System.out.println(getName());
	}
}
