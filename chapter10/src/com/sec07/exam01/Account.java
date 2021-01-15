package com.sec07.exam01;

public class Account {	//����� ���� ���� �߻���Ű��
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {	//����� ���� ���� ���ѱ��
		if(balance < money) {
			//����� ���� ���� �߻�
			throw new BalanceInsufficientException("�ܰ����: " + (money - balance) + " ���ڶ�");
		}
		balance -= money;
	}
}
