package com.sec08_03.exam01;

public class ThreadGroupExample {	//������ �׷��� �̿��� �ϰ� ���� ����
	public static void main(String[] args) {
		//myGroup�� �� �����带 ���Խ�Ŵ
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		//
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		//
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();	//[������ �̸�, �켱����, �Ҽ� �׷��]
		//
		System.out.println();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ�� ]");
		myGroup.interrupt();	//
	}
}
