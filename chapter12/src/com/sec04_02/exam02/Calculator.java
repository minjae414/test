package com.sec04_02.exam02;

public class Calculator {	//���� ��ü
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {	//���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		synchronized(this) {
			this.memory = memory;	//�Ű����� memory �ʵ忡 ����
			//�����带 2�ʰ� �Ͻ� ������Ŵ
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()/*�������� �̸�*/ 
					+ ": " + this.memory/*�޸� ��*/);
		}
	}
}
