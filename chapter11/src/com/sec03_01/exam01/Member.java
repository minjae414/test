package com.sec03_01.exam01;

public class Member {	//��ü ���� ��(equals() �޼ҵ�)
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	//�Ű����� Member Ÿ������ Ȯ��
			//Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id �ʵ尪�� �������� �˻��� ��, �����ϴٸ� true�� ����
			Member member = (Member)obj;
			if(id.contentEquals(member.id)) {
				return true;
			}
		}
		return false;	//�Ű����� Member Ÿ���� �ƴϰų� id �ʵ尪�� �ٸ� ��� false�� ����
	}
}
