package exer05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studnetNo) {
		super(name);	//추가 부분
		this.name = name;
		this.studentNo = studentNo;
		
	}
}
