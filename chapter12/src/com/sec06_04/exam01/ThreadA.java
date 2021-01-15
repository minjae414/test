package com.sec06_04.exam01;

public class ThreadA extends Thread {	//WorkObject�� methodA()�� �����ϴ� ������
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;	//���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodA();	//���� ��ü�� methodA()�� 10�� �ݺ� ȣ��
		}
	}
}
