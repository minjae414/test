package com.sec03_05.exam01;

public class Counter {	//finalize() �޼ҵ��� ������
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
}
