package com.sec02_02.exam01;

public class BeepPrintExample3 {	//메인 스레드와 작업 스레드가 동시에 실행
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
		
		/*
		//다른 방법1. 익명 객체
		Thread thread = new Thread() {
			@Override
			public void run() {
				//스레드 실행 내용
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++){
					toolkit.beep();
					try {Thread.sleep(500);}
					catch(Exception e) {}
				}
			}
		};
		*/
	}
}
