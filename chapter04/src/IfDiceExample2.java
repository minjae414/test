
public class IfDiceExample2 {
	
	public static void main(String[] args) {
		
		//int num = (int)(Math.random() * 45) + 1;	//로또 번호 하나 뽑기
		int[] num = {0,0,0,0,0,0};
		
		//로또 생성 번호 1~45
		
		for(int i = 0; i < 6; i++) {
			num[i] = (int)(Math.random() * 45) + 1;
			
			System.out.println("로또번호 생성 = " + num[i]);
		}
	}
}
