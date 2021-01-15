package com.sec06_02.exam01;

public class YeildExample {	//스레드 실행 양보 예제
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		//ThreadA, ThreadB 모두 실행
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		threadA.work = false;	//ThreadB만 실행
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		threadA.work = true;	//ThreadA, ThreadB 모두 실행
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		//ThreadA, ThreadB 모두 종료
		threadA.stop = true;
		threadB.stop = true;
	}
}
