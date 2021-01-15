
public class Car {

	//필드
	/*String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;*/
	
	//210p
	/*String company = "현대 자동차";	
	String model;
	String color;
	int maxSpeed;
	
	Car(){	//생성자1
		
	}
	
	Car(String color, int cc){	//생성자2
		
	}
	
	Car(String model){	//생성자3
		this.model = model;
	}
	
	Car(String model, String color){	//생성자4
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){	//생성자5
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}*/
	
	/*213p
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}*/
	
	//223p
	/*
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas(){
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;	//false를 리턴
		}
		
		System.out.println("gas가 있습니다.");
		return true;	//true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;	//메소드 실행 종료
			}
		}
	}*/
	
	//229p
	/*
	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}*/
	
	//235p
	/*
	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}*/
	
	//255p
	/*
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}*/
	
	//267p
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}

