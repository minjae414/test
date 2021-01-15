package com.sec02_01.exam02;

public class BeepPrintExample2 {	//���� ������� �۾� �����尡 ���ÿ� ����
	public static void main(String[] args) {	//���� ������
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); //BeepRunnable
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
		/*
		//�ٸ� ��� 1. Runnable �͸� ��ü �̿�
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
		//�ٸ���� 2. ���ٽ� �̿�
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
