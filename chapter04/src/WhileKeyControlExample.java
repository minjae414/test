
public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {	//EnterŰ�� �ԷµǸ� ĳ��������(13)�� �����е�(10)�� �ԷµǹǷ� �� ���� ���ܽ�Ŵ
				System.out.println("----------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("----------------------");
				System.out.println("���� : ");	//�޴� ����
			}
			
			keyCode = System.in.read();//Ű������ Ű �ڵ� ����
			
			if(keyCode == 49) {	//1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if(keyCode == 50) {	//1�� �о��� ���
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if(keyCode == 51) {	//1�� �о��� ���
				run = false;
			}
		}
		System.out.println("���α׷� ����");
		
	}
}
