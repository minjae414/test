package com.exer05;

public class Anonymous {	//�͸� ���� Ŭ���ÿ� ��ü ����
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}