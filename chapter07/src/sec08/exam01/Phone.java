package sec08.exam01;

public abstract class Phone {	//abstract class
	//field
	public String owner;
	
	//constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//method
	public void turnOn() {
		System.out.println("Power on a phone");
	}
	
	public void turnOff() {
		System.out.println("Power off a phone");
	}
}
