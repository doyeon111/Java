package exam15;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		a1.deposit(100);
		a2.deposit(50);
		
		a1.withdraw(60);
		a2.withdraw(300);
		
		//System.out.println("a1ŔÇ ŔÜ°í: " + a1.getBalance());
		//System.out.println("a2ŔÇ ŔÜ°í: " + a2.getBalance());
		
		a1.printBalance();
		a2.printBalance();
		
		a1.addInterest();
		a2.addInterest();
		
		a1.printBalance();
		a2.printBalance();
	}

}
 
