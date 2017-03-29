import java.util.Date;
public class eleven_three {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000, 4.5);
		
		account.setWithdraw(2500);
		account.setDeposit(3000);
		account.setTotal(0);
		account.setMonthly(0);
		
		System.out.println(account.toString());

	}

}
