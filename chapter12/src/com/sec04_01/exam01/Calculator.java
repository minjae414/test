package com.sec04_01.exam01;

public class Calculator {	//���� ��ü
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {	//���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		this.memory = memory;	//�Ű����� memory �ʵ忡 ����
		//�����带 2�ʰ� �Ͻ� ������Ŵ
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()/*�������� �̸�*/ 
				+ ": " + this.memory/*�޸� ��*/);
	}
}
