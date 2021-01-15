/*
 * Member Ŭ������ �ۼ��ϵ�, Object�� toString() �޼ҵ带 �������̵��ؼ� MemberExample
 * Ŭ������ ���� ���ó�� �������� �ۼ��غ�����.
 */

package ex04;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//���⼭ �ڵ带 �ۼ��ϼ���.
	@Override
	public String toString() {
		return id.toString() + ": " + name.toString();
	}
}
