package com.sec02_02.exam01;

import java.awt.Toolkit;

public class BeepThread extends Thread {	//비프음을 들려주는 스레드
	@Override
	public void run() {
		//스레드 실행 내용
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
