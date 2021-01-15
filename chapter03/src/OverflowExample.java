

public class OverflowExample {

	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		long xx = 1000000;
		long yy = 1000000;
		long zz = xx * yy;
		System.out.println(zz);
	}
}
