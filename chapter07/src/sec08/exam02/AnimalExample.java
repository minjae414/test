package sec08.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();	//Promotion
		animal.sound();	//Overriding �� method ȣ��
		animal = new Cat();	//Promotion
		animal.sound();	//Overriding �� method ȣ��
		System.out.println("----");
		
		//�޼ҵ��� ������
		animalSound(new Dog());	//�ڵ� Ÿ�� ��ȯ(Promotion)
		animalSound(new Cat());	//�ڵ� Ÿ�� ��ȯ(Promotion)
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
