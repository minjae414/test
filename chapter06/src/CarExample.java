
public class CarExample {

	public static void main(String[] args) {
		
		/*//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);*/
		
		//Car myCar = new Car("검정", 3000);
		//Car myCar = new Car(); //기본 생성자를 호출할 수 없다
		
		//p210
		/*Car car1 = new Car();	//생성자 선택1
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");	//생성자 선택2
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3= new Car("자가용", "빨강");	//생성자 선택3
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4= new Car("택시", "검정", 200);	//생성자 선택4
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();*/
		
		
		/* 213p
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company + "\n");
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model + "\n");
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color + "\n");
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);*/
		
		//223p
		/*
		Car myCar = new Car();
		
		myCar.setGas(5);	//Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();	//Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();//Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {	//Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}*/
		
		//229p
		/*
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");*/
		
		//235p
		/*
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		*/
		
		//267p
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}