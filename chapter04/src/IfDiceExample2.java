
public class IfDiceExample2 {
	
	public static void main(String[] args) {
		
		//int num = (int)(Math.random() * 45) + 1;	//�ζ� ��ȣ �ϳ� �̱�
		int[] num = {0,0,0,0,0,0};
		
		//�ζ� ���� ��ȣ 1~45
		
		for(int i = 0; i < 6; i++) {
			num[i] = (int)(Math.random() * 45) + 1;
			
			System.out.println("�ζǹ�ȣ ���� = " + num[i]);
		}
	}
}
