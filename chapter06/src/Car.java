
public class Car {

	//�ʵ�
	/*String company = "���� �ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;*/
	
	//210p
	/*String company = "���� �ڵ���";	
	String model;
	String color;
	int maxSpeed;
	
	Car(){	//������1
		
	}
	
	Car(String color, int cc){	//������2
		
	}
	
	Car(String model){	//������3
		this.model = model;
	}
	
	Car(String model, String color){	//������4
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){	//������5
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}*/
	
	/*213p
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){
		
	}
	
	Car(String model){
		this(model, "����", 250);
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
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas(){
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;	//false�� ����
		}
		
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;	//true�� ����
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�: " + gas + ")");
				return;	//�޼ҵ� ���� ����
			}
		}
	}*/
	
	//229p
	/*
	//�ʵ�
	int speed;
	
	//������
	
	//�޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü� : " + speed + "km/h)");
		}
	}*/
	
	//235p
	/*
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car(String model){
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü� : " + this.speed + "km/h)");
		}
	}*/
	
	//255p
	/*
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}*/
	
	//267p
	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	
	//�޼ҵ�
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

