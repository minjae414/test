package sec08.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();	//Promotion
		animal.sound();	//Overriding 된 method 호출
		animal = new Cat();	//Promotion
		animal.sound();	//Overriding 된 method 호출
		System.out.println("----");
		
		//메소드의 다형성
		animalSound(new Dog());	//자동 타입 변환(Promotion)
		animalSound(new Cat());	//자동 타입 변환(Promotion)
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
