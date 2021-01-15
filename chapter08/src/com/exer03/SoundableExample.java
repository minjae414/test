/*
 * SoundableExample Ŭ�������� printSound() �޼ҵ�� Soundable �������̽� Ÿ���� �Ű� ������ ������ �ֽ��ϴ�
 * main() �޼ҵ忡�� printSound()�� ȣ���� �� Cat�� Dog ��ü�� �ְ� �����ϸ� ���� "�߿�"�� "�۸�"�� ��µǵ��� Cat�� Dog Ŭ������ �ۼ��غ�����.
 */

package com.exer03;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
