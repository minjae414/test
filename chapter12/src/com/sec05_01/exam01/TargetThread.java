package com.sec05_01.exam01;

public class TargetThread extends Thread {	//Ÿ�� ������
	public void run() {
		for(long i = 0; i < 1000000000; i++) {}
		
		try {
			//1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(long i = 0; i < 1000000000; i++) {}
	}
}
