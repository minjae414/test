package com.sec06_04.exam01;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		//ThreadA�� ThreadB ����
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		//ThreadA�� ThreadB�� ����
		threadA.start();
		threadB.start();
	}
}
