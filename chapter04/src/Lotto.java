public class Lotto {
	public static void main(String[] args) {
	
		
		//1. �迭
		int[] num = new int[6];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				while(num[i]==num[j]) {	
					num[i] = (int)(Math.random() * 45) + 1;
					j = 0;
				} 
			}
			System.out.println("�ζ� ��ȣ : " + num[i]);
		}
		
		
		/*
		//2.
		int num1, num2, num3, num4, num5, num6;
		do {
			//���� ����
			num1 = (int)(Math.random() * 45) + 1;
			num2 = (int)(Math.random() * 45) + 1;
			num3 = (int)(Math.random() * 45) + 1;
			num4 = (int)(Math.random() * 45) + 1;
			num5 = (int)(Math.random() * 45) + 1;
			num6 = (int)(Math.random() * 45) + 1;			
		} while(num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 ||	//num1�� �� 
				num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6 ||	//num2�� ��
				num3 == num4 || num3 == num5 || num3 == num6 ||	//num3�� ��
				num4 == num5 || num4 == num6 || //num4�� ��
				num5 == num6);	//������ ��
		//���
		System.out.println("�ζ� ��ȣ : " + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "," + num6);	
		*/
	}		
}

