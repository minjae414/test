
public class CalculatorExample {

	public static void main(String[] args) {
		
		//217p
		/*
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();*/
		
		//227p
		/*
		Calculator myCalc = new Calculator();
		myCalc.execute();//Calculator�� execute() �޼ҵ� ȣ��*/
		
		//232p
		/*
		Calculator myCalcu = new Calculator();
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢���� ���� = " + result1);
		System.out.println("���簢���� ���� = " + result2);*/
		
		//238p
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
