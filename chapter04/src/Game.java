
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		int iInput = 0;
		do {
			int com = (int)(Math.random() * 3) + 1;
			do {
				System.out.println("입력 > ");
				input = scanner.nextLine();
				if(input.equals("q")) {
					System.out.println("종료");
					return;
				}
			} while(!(input.equals("가위") || input.equals("바위") || input.equals("보") || input.equals("q")));
			
			switch(input) {
			case "가위":
				iInput = 1;
				break;
			case "바위":
				iInput = 2;
				break;
			case "보":
				iInput = 3;
				break;
			}
			
			switch(iInput - com) {
			case -1:
			case 2:
				System.out.println("승");
				break;
			case 1:
			case -2:
				System.out.println("패");
				break;
			default:
				System.out.println("무");	
			}
		} while(!(input.equals("q")));
	}
}
