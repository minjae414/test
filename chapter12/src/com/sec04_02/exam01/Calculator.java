package com.sec04_02.exam01;

public class Calculator {	//공유 객체
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {	//계산기 메모리에 값을 저장하는 메소드
		this.memory = memory;	//매개값을 memory 필드에 저장
		//스레드를 2초간 일시 정지시킴
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()/*스레드의 이름*/ 
				+ ": " + this.memory/*메모리 값*/);
	}
}
