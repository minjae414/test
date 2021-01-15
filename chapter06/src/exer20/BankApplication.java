package exer20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	//���� �����ϱ�
	private static void createAccount() {
		
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano;
		while(true) {	
			ano = scanner.next();
			if(findAccount(ano) != null) {
				if(findAccount(ano).getAno().equals(ano))
				{
					System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
					System.out.println("�ٸ� ��ȣ�� �Է��ϼ���.");
					System.out.print("���¹�ȣ: ");
				}
			} else {
				break;
			}
		}
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				break;
			}
		}
		System.out.println("���°� �����Ǿ����ϴ�.");
	}
	
	//���� ��Ϻ���
	private static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		for(int i = 0; i < accountArray.length && accountArray[i] != null; i++) {
			System.out.print(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			System.out.println();
		}
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		Account my = findAccount(ano);
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();
		balance += my.getBalance();
		my.setBalance(balance);
		System.out.println("���: ������ �����Ǿ����ϴ�.");	
	}
	
	//����ϱ�
	private static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		Account my = findAccount(ano);
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		balance -= my.getBalance();
		my.setBalance(balance);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		int i;
		for(i = 0; i < accountArray.length; i++) {
			
			if(accountArray[i] == null) {
				return null;
			}
			if(accountArray[i].getAno().equals(ano)) {
				break;
			}
		}
		return accountArray[i];
	}
}
