package com.sec08_03.exam01;

public class ThreadGroupExample {	//스레드 그룹을 이용한 일괄 종료 예제
	public static void main(String[] args) {
		//myGroup에 두 스레드를 포함시킴
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		//
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		//
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();	//[스레드 이름, 우선순위, 소속 그룹명]
		//
		System.out.println();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();	//
	}
}
