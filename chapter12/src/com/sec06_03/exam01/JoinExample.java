package com.sec06_03.exam01;

public class JoinExample {	//�ٸ� �����尡 ����� ������ �Ͻ� ���� ���� ����
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		 
		//�� ���� ������ ���� ��Ȯ�� �ȳ���
		try {
			sumThread.join();	//sumThread�� ������ ������ ���� �����带 �Ͻ� ������Ŵ
		} catch(InterruptedException e) {}

		
		System.out.println("1~100 ��: " + sumThread.getSum());
	}
}
