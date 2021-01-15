//키보드로부터 학생 수와 학생들의 점수를 입력 받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다. 실행 결과를 보고 알맞게 작성해보세요(참고로 16라인에서 Scanner의 nextInt() 메소드는 콘솔에 입력된 숫자를 읽고 리턴합니다.

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();	//콘솔에서 숫자 입력 후 입력 값 리턴
			
			if(selectNo == 1) {
				System.out.print("학생 수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2) {
				if(studentNum == 0) {	//학생 수 입력 전 실행 시
					System.out.println("학생 수를 먼저 입력해 주세요.");
					continue;
				}
				
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				
			} else if(selectNo == 3) {
				if(studentNum == 0) {	//학생 수 입력 전 실행 시
					System.out.println("학생 수를 먼저 입력해 주세요.");
					continue;
				}
				
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				
			} else if(selectNo == 4) {
				if(studentNum == 0) {	//학생 수 입력 전 실행 시
					System.out.println("학생 수를 먼저 입력해 주세요.");
					continue;
				}
				
				int sum = 0;
				for(int i: scores) {
					sum += i;
				}
				double avg = (double)sum / studentNum;
				System.out.println("최고 점수: " + sum);
				System.out.println("평균 점수:" + avg);
				
			} else if(selectNo == 5) {
				run = false;
				
			} else {
				System.out.println("범위 내 값을 입력 해주세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
	}
}
