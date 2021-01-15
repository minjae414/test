package com.sec02_03.exam01;

public class ThreadA extends Thread {	//ThreadA 클래스
	public ThreadA() {
		setName("ThreadA");	//스레드 이름 설정
	}
	
	public void run() {
		//ThreadA 실행 내용
		for(int i = 0; i < 2; i++) {
			System.out.println(getName()/*스레드 이름 얻기*/ + "가 출력한 내용");
		}
	}
}
