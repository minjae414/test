/*���� ���� ��ü�� Exercise19 ��ü�� �ܰ�(balance) �ʵ带 ������ �ֽ��ϴ�. 
 * balance �ʵ�� �������� �� �� ����, �ִ� �鸸 �������� ������ �� �ֽ��ϴ�.
 * �ܺο��� balance �ʵ带 ������� �������� ���ϵ��� �ϰ�, 
 * 0 <= balance <= 1,000,000 ������ ���� ���� �� �ֵ��� Exercise19 Ŭ������ �ۼ��غ�����.*/

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