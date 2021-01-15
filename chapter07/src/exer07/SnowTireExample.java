package exer07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;	//자동 형변환
		
		snowTire.run();
		tire.run();	//하지만 오버라이딩된 메소드
	}
}
