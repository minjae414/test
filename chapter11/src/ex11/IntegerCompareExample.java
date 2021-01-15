/*
 * 숫자 100과 300으로 각각 박싱된 Integer 객체를 == 연산자로 비교했습니다. 100을 박싱한
 * Integer 객체는 true가 나오는데, 300을 박싱한 Integer 객체는 false가 나오는 이유를 설명해보
 * 세요.
 */

package ex11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
	}
}
