
public class InputDataCheckNaNExample2 {

		public static void main(String[] args) {
			
			/*
			String userInput = "NaNa";	//���ڿ��� ���ڰ� �ƴ�
			 
			double val = Double.valueOf(userInput);	//Double.valueOf(a) : a�� double������ �ٲ�� �޼ҵ�
			
			double currentBalance = 10000.0;
			currentBalance += val;	//currentBalance = currentBalance + val;
			//10000.0 + NaN => NaN
			System.out.println(currentBalance);	//NaN
			*/
			
			/*
			String userInput = "       1234  ";	//���� ���� ������ �Ұ�
			double val = Double.valueOf(userInput);
			System.out.println(val);
			*/
			
			String userInput = "NaN";
			double currentBalance = 10000.0;
			double val = Double.valueOf(userInput);
			
			if(Double.isNaN(val)) {
				System.out.println("val ������ NaN�� �ԷµǾ� ó���� �� ����");
				System.out.println("������ �����ϵ��� val���� 0.0���� �����մϴ�");
				val = 0.0;
			}
			
			currentBalance += val;
			
			System.out.println(currentBalance);
		}
}
