package com.sec02_02.exam01;

public class BeepPrintExample3 {	//���� ������� �۾� �����尡 ���ÿ� ����
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
		
		/*
		//�ٸ� ���1. �͸� ��ü
		Thread thread = new Thread() {
			@Override
			public void run() {
				//������ ���� ����
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
