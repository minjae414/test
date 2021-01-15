package com.sec06_04.exam01;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		//ThreadA客 ThreadB 积己
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		//ThreadA客 ThreadB甫 角青
		threadA.start();
		threadB.start();
	}
}
