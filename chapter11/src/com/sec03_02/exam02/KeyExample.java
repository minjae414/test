package com.sec03_02.exam02;

import java.util.HashMap;

public class KeyExample {	//���� Ű�� �ν�
	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		System.out.println(hashMap.hashCode());
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �о��
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
