/*
 * �α��� ����� Member Ŭ������ login() �޼ҵ忡�� �����Ϸ��� �մϴ�.
 * �������� �ʴ� ID�� �Է����� ��� NotExistIDException�� �߻���Ű��,
 * �߸��� �н����带 �Է����� ��� WrongPasswordException�� �߻���Ű���� �մϴ�.
 * LoginExample�� ���� ����� ���� ��ĭ�� ä��������.
 */

package com.exer07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}
