
public class Exercise19Exam {

	public static void main(String[] args) {
		Exercise19 account = new Exercise19();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	}
}
