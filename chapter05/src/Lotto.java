
public class Lotto {
	/*
	 * (1 ~ 45) 45���� ���� �� 6���� ���ڸ� �ߺ����� �߻����� ���
	 * int �迭�� ����Ͽ� �ۼ�
	 */
	
	public static void main(String[] args) {
		
		
		//1.
		int[] num = new int[6];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 6) + 1;
			for(int j = 0; j < i; j++) {
				while(num[i]==num[j]) {	
					num[i] = (int)(Math.random() * 6) + 1;
					j = 0;
				} 
			}
			System.out.println("�ζ� ��ȣ : " + num[i]);
		}
		
		/*
		//2.
		int[] num = new int[6];
		boolean check = true;
		do {
			System.out.println("--------------");
			for(int i = 0; i < num.length; i++) {
				num[i]=(int)(Math.random() * 45 + 1);
				System.out.println("�ζ� ��ȣ : " + num[i]);
			}
			
			check = false;
			
			BP : for(int j = 0; j < num.length; j++) {
				for(int k = j + 1; k < num.length; k++) {
					if(num[j] == num[k]) {
						check = true;
						System.out.println("####�ٽ� ��÷####");
						break BP;
					}
				}
			}
		}while(check);
		*/
		
		
		
	}
}
