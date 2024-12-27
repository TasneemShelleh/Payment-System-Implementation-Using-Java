/* Tasneem Ali Shelleh 
   1220439
   Lab section : 4 */
package finalProject;

public class Check extends CustomerPayment implements Payable  {
	private int accountNumber;
	private double accountBalance;
	private int type;
	public static final int CASHIER=1, CERTIFIED=2, PERSONAL=3;
	
	public Check() {}
	
	public Check( String customerName,int customerId,double amount,int accountNumber,double accountBalance,int type) {
		super(customerName , customerId,amount);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.type = type;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
		
	}
	
	//calculate the payment amount which is equal to( amount )
	@Override
	protected double calculatePayment() {
		return amount;
	}
	
	//deduct the amount from accountBalance based on type number which is must be CERTIFIED=2 and PERSONAL=3
	public void deductAmountFromBalance() {
		if(type != CASHIER ) {
			accountBalance -= getAmount();
		}
	}
	
	//implement method deductAmountFromBalance after check if the Check payment is authorized or not
	//that is authorized if either the type of the check is CASHIER or the amount of the payment is less than or equal to the accountBalance 
	@Override
	public boolean isAuthorized(){
		boolean isAuth = ((type == CASHIER)||(calculatePayment()<= accountBalance));
		this.deductAmountFromBalance();
		return isAuth;		
	}

	@Override
	public String toString() {
		return "Check [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", type=" + type
				+ ", CustomerName=" + CustomerName + ", Customermerld=" + Customermerld + ", amount=" + amount + "]";
	}
	
}
