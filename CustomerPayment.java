/* Tasneem Ali Shelleh 
   1220439
   Lab section : 4 */
package finalProject;

public abstract class CustomerPayment implements Comparable<CustomerPayment> {
	protected String CustomerName;
	protected int Customermerld;
	protected double amount;
	
	public CustomerPayment() {}
	
	public CustomerPayment(String CustomerName ,int Customermerld, double amount) {
		this.CustomerName = CustomerName;
		this.Customermerld = Customermerld;
		this.amount = amount;
	}
	

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getCustomermerld() {
		return Customermerld;
	}

	public void setCustomermerld(int customermerld) {
		Customermerld = customermerld;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	protected abstract double calculatePayment();
	
	//print the properties and the calculated payment 
	void printPaymentInfo() {
		
		System.out.println(toString()+ " Payment = " + calculatePayment());
	}
	
	//compare descending based on the returned value of the method calculatePayment
	@Override
	public int compareTo(CustomerPayment compare) {
		if(calculatePayment() > compare.calculatePayment()) 
			return -1;
		else if(calculatePayment() < compare.calculatePayment()) 
			return 1;
		else
			return 0;
	}


	@Override
	public String toString() {
	return "CustomerPayment [CustomerName=" + CustomerName + ", Customermerld=" + Customermerld + ", amount="
			+ amount + "]";
	}
}