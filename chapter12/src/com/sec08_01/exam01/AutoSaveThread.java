package com.sec08_01.exam01;

public class AutoSaveThread extends Thread {	//1�� �ֱ�� save() �޼ҵ带 ȣ���ϴ� ���� ������
	public void save() {
		System.out.println("�۾� ������ ������.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}
