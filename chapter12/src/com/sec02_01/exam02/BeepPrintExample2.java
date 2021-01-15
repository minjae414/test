package com.sec02_01.exam02;

public class BeepPrintExample2 {	//메인 스레드와 작업 스레드가 동시에 실행
	public static void main(String[] args) {	//메인 스레드
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); //BeepRunnable
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
		/*
		//다른 방법 1. Runnable 익명 객체 이용
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		});
		*/
		
		/*
		//다른방법 2. 람다식 이용
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		});
		*/
	}
}
