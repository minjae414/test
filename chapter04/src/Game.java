
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		int iInput = 0;
		do {
			int com = (int)(Math.random() * 3) + 1;
			do {
				System.out.println("�Է� > ");
				input = scanner.nextLine();
				if(input.equals("q")) {
					System.out.println("����");
					return;
				}
			} while(!(input.equals("����") || input.equals("����") || input.equals("��") || input.equals("q")));
			
			switch(input) {
			case "����":
				iInput = 1;
				break;
			case "����":
				iInput = 2;
				break;
			case "��":
				iInput = 3;
				break;
			}
			
			switch(iInput - com) {
			case -1:
			case 2:
				System.out.println("��");
				break;
			case 1:
			case -2:
				System.out.println("��");
				break;
			default:
				System.out.println("��");	
			}
		} while(!(input.equals("q")));
	}
}
