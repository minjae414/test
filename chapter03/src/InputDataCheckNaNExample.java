
public class InputDataCheckNaNExample {

		public static void main(String[] args) {
			
			String userInput = "NaN";	//����ڷκ��� �Է¹��� ��
			double val = Double.valueOf(userInput);	//�Է°��� double Ÿ������ ��ȯ
			
			double currentBalance = 10000.0;
			
			if(Double.isNaN(val)) {	//NaN�� �˻���
				System.out.println("Nan�� �ԷµǾ� ó���� �� ����");
				val = 0.0;	//NaN�� ��� ����Ǵ� �ڵ�
			}
			
			currentBalance += val;	//currentBalance�� NaN�� �����; > isNaN�� ���� currentBalance�� ���� ���� ���� ��
			System.out.println(currentBalance);
			
		}
}
