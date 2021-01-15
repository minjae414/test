package sec08.exam02;

public class Cat extends Animal {	//abstract method overriding
	public Cat() {
		this.kind = "mammalia";
	}
	
	@Override
	public void sound() {	//abstract method override
		System.out.println("¾ß¿Ë");
	}

}
