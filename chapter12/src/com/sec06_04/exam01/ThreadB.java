package com.sec06_04.exam01;

public class ThreadB extends Thread {	//WorkObject�� methodB()�� �����ϴ� ������
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;	//���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodB();//���� ��ü�� methodB()�� 10�� �ݺ� ȣ��
		}
	}
}
