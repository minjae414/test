
public class IfExample{
	public static void main(String[] args) {
		/*
		 * 100 ~ 90 �̸� 'A'���
		 * 89 ~ 80 �̸� 'B'���
		 * 79 ~ 70 �̸� 'C'���
		 * 69 ~ 60 �̸� 'D'���
		 * 69 �̸��̸� 'F'���
		 * ������ 0 ~ 100 ���� ���� �ƴϸ� �Է°� ����
		 */
		
		int score = 98;
		int value = (int)score / 10;
		String result = null;	//2.
		
		//1. ��ø if
		if(score >= 0) {
			if(score <= 100) {
				if(value >= 9) {
					System.out.println("1.��� : A");
				}
				if(value == 8) {
					System.out.println("1.��� : B");
				}
				if(value == 7) {
					System.out.println("1.��� : C");
				}
				if(value == 6) {
					System.out.println("1.��� : D");
				}
				if(value <= 5){
					System.out.println("1.��� : F");
				}
			}
		}
		
		if(score < 0) {
			System.out.println("1.�Է°� ����");
		}
		if(score > 100) {
			System.out.println("1.�Է°� ����");
		}
		
		
		//2. ���� ������
		if(value >= 9) {
			result = (score > 100) ? "�Է°� ����" : "��� : A";
		}
		if(value == 8) {
			result = "��� : B";
		}
		if(value == 7) {
			result = "��� : C";
		}
		if(value == 6) {
			result ="��� : D";
		}
		if(value <= 5){
			result = (score < 0) ? "�Է°� ����" : "��� : F";
		}
		
		System.out.println("2." + result);

		
		//3. return
		if(score < 0) {
			System.out.println("3.�Է°� ����");
			return;
		}
		if(score > 100) {
			System.out.println("3.�Է°� ����");
			return;
		}
		if(value >= 9) {
			System.out.println("3.��� : A");
		}
		if(value == 8) {
			System.out.println("3.��� : B");
		}
		if(value == 7) {
			System.out.println("3.��� : C");
		}
		if(value == 6) {
			System.out.println("3.��� : D");
		}
		if(value <= 5){
			System.out.println("3.��� : F");
		}
	}
}