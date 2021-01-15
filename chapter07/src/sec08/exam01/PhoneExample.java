package sec08.exam01;

public class PhoneExample {	//Execution class
	public static void main(String[] args) {
		//Phone phone = new Phone();	//Can't creat instance
		
		SmartPhone smartPhone = new SmartPhone("HongGilDong");
		
		smartPhone.turnOn();	//Method of Phone
		smartPhone.internetSearch();	//Method of SmartPhone
		smartPhone.turnOff();	//Method of Phone
	}
}
