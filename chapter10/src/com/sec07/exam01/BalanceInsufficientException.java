package com.sec07.exam01;

public class BalanceInsufficientException extends Exception {	//����� ���� ���� Ŭ����
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
