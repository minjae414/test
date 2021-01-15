/*은행 계좌 객체인 Exercise19 객체는 잔고(balance) 필드를 가지고 있습니다. 
 * balance 필드는 음수값이 될 수 없고, 최대 백만 원까지만 저장할 수 있습니다.
 * 외부에서 balance 필드를 마음대로 변경하지 못하도록 하고, 
 * 0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록 Exercise19 클래스를 작성해보세요.*/

public class Exercise19 {
	
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int balance = 0;
	
	public void setBalance(int balance) {
		
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} else {
			return;
		}
	}
	public int getBalance() {
		return balance;
	}
}