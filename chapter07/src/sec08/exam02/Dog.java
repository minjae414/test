package sec08.exam02;

public class Dog extends Animal {	//abstract method overriding
	public Dog() {
		this.kind = "mammalia";
	}
	
	@Override
	public void sound() {	//abstract Method override
		System.out.println("¸Û¸Û");
	}
}
