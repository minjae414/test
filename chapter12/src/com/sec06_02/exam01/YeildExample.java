package com.sec06_02.exam01;

public class YeildExample {	//������ ���� �纸 ����
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		//ThreadA, ThreadB ��� ����
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		threadA.work = false;	//ThreadB�� ����
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		threadA.work = true;	//ThreadA, ThreadB ��� ����
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		//ThreadA, ThreadB ��� ����
		threadA.stop = true;
		threadB.stop = true;
	}
}
