//�־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����(for���� �̿��ϼ���)
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
