package sec07.exam07;

public class InstanceofExample {
	public static void method1(Parent parent) {	
		if(parent instanceof Child) {	//Check conversion to Child type
			Child child = (Child)parent;
			System.out.println("method1 - Child : Converted");
		} else {
			System.out.println("method1 - Child : Not converted");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;	//ClassCastException can be cause
		System.out.println("method2 - Child : Converted");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//method2(parentB);	//cause exception
	}
}
