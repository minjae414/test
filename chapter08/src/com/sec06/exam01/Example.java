package com.sec06.exam01;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();	//InterfaceA ������ methodB()�� ȣ�� ����
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();	//InterfaceB ������ methodB()�� ȣ�� ����
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();	//InterfaceC ������ methodA(), methodB(), methodC() ��� ȣ�� ����
	}
}
