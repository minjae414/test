
public class BitShiftExample {

	public static void main(String[] args) {
		
		/*System.out.println("1 << 3 = " + (1 << 3));
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));*/
		System.out.println("1 => " + toBinaryString(1));
		System.out.println("1 << 3 = " + (1 << 3) );
		System.out.println("1 << 3 => " + toBinaryString(1 << 3));
		System.out.println("1 << 2 => " + toBinaryString(1 << 2));
		System.out.println("==============================================");
		System.out.println("-8 => " + toBinaryString(-8));
		System.out.println("-8 >> 3 => " + (-8 >> 3));
		System.out.println("-8 >> 3 => " + toBinaryString(-8 >> 3));
		System.out.println("-8 >>> 3 => " + (-8 >>> 3));
		System.out.println("-8 >>> 3 => " + toBinaryString(-8 >>> 3));
	}
	public static String toBinaryString(int value) {	//75p BitReverseOperatorExample
		
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		
		return str;
	}
}
