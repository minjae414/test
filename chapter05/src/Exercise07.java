//주어진 배열의 항목에서 최대값을 구해보세요(for문을 이용하세요)
public class Exercise07 {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		int max = 0;	//max = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length - 1; ) {
			if(max < array[++i]) {
				max = array[i];
			}
		}
		/*
		for(int newArr : array) {
			if(max <= newArr) {
				max = newArr;
			}
		}
		*/
		System.out.println("max : " + max);
	}
}
