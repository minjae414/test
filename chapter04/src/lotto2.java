

public class lotto2 {
	
	static int a, b, c, d, e, f;
	public static void fun1() {
		do {	//추가
			a=(int)(Math.random()*45 + 1);
			b=(int)(Math.random()*45 + 1);
			c=(int)(Math.random()*45 + 1);
			d=(int)(Math.random()*45 + 1);
			e=(int)(Math.random()*45 + 1);
			f=(int)(Math.random()*45 + 1);
			if(a!=b && a!=c && a!=d && a!=e && a!=f) {
				if(b!=c && b!=d && b!=e && b!=f) {
					if(c!=d && c!=e && c!=f) {
						if(d!=e && d!=f) {
							if(e!=f) {
							break;
							}
						}
					}
				}
			}	//else 생략가능
		} while(true);	//추가
	}
	public static void main(String[] args) {
		fun1();
		System.out.print("로또번호 :" + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
	}
}
