import java.util.Scanner;	//Scanner Ŭ������ ����ϱ� ���� �ʿ�

public class DowhileExample {

	public static void main(String[] args) {
		
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);	//Scanner ��ü ����
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();	//Ű����� �Է��� ���ڿ��� ����
			System.out.println(inputString);
			
		} while(! inputString.contentEquals("q"));	//���ڿ��� ���� ���� equals() �޼ҵ带 ���
		
		System.out.println();
		System.out.println("���α׷� ����");
		
		//scanner.close();	//������ ��� �߳�
	}
}
