package sec08.exam02;

public abstract class Animal {	//Abstract Class
	public String kind;
	
	public void breathe() {
		System.out.println("Breathing");
	}
	
	public abstract void sound();	//Abstract Method
}
