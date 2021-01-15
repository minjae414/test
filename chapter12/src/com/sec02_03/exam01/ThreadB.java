package com.sec02_03.exam01;

public class ThreadB extends Thread {	//ThreadB 클래스
	public void run() {
		//ThreadB 실행 내용
		for(int i = 0; i < 2; i++) {
			System.out.println(getName()/*스레드 이름 얻기*/ + "가 출력한 내용");
		}
	}
}
