/*
 * ActionExample Ŭ������ main() �޼ҵ忡�� Action�� �͸� ���� ��ü�� ����� ������ ���� ���� ����� ���� �� �ֵ��� �ڽ� �ȿ� ��ư� �ڵ带 �ۼ��غ�����.
 */

package com.exer05;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		
		action.work();
	}
}
