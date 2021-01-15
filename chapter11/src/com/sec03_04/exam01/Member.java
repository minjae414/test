package com.sec03_04.exam01;

public class Member implements Cloneable {	//������ �� �ִ� Ŭ���� ����
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();	//clone() �޼ҵ��� ���� Ÿ���� Object�̹Ƿ� Member Ÿ������ ĳ�����ؾ� ��
		} catch(CloneNotSupportedException e) {}
		return cloned;
	}
}
