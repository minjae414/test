//Ű����κ��� �л� ���� �л����� ������ �Է� �޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��Դϴ�. ���� ����� ���� �˸°� �ۼ��غ�����(����� 16���ο��� Scanner�� nextInt() �޼ҵ�� �ֿܼ� �Էµ� ���ڸ� �а� �����մϴ�.

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. �л� �� | 2. ���� �Է� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
			System.out.println("------------------------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();	//�ֿܼ��� ���� �Է� �� �Է� �� ����
			
			if(selectNo == 1) {
				System.out.print("�л� �� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2) {
				if(studentNum == 0) {	//�л� �� �Է� �� ���� ��
					System.out.println("�л� ���� ���� �Է��� �ּ���.");
					continue;
				}
				
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				
			} else if(selectNo == 3) {
				if(studentNum == 0) {	//�л� �� �Է� �� ���� ��
					System.out.println("�л� ���� ���� �Է��� �ּ���.");
					continue;
				}
				
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				
			} else if(selectNo == 4) {
				if(studentNum == 0) {	//�л� �� �Է� �� ���� ��
					System.out.println("�л� ���� ���� �Է��� �ּ���.");
					continue;
				}
				
				int sum = 0;
				for(int i: scores) {
					sum += i;
				}
				double avg = (double)sum / studentNum;
				System.out.println("�ְ� ����: " + sum);
				System.out.println("��� ����:" + avg);
				
			} else if(selectNo == 5) {
				run = false;
				
			} else {
				System.out.println("���� �� ���� �Է� ���ּ���.");
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		
		scanner.close();
	}
}
