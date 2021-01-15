package sec08.exam01;

public class SmartPhone extends Phone {	//Entity Class
	//Constructor
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//Method
	public void internetSearch() {
		System.out.println("Search the Internet.");
	}
}
