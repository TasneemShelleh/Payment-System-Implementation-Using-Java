/* Tasneem Ali Shelleh 
   1220439
   Lab section : 4 */
package finalProject;

public class Cash extends CustomerPayment{
	private double discountRate ;
	
	public Cash() {}
	
	public Cash ( String CustomerName ,int Customermerld, double amount , double discountRate ){
		super(CustomerName,Customermerld,amount);
		this.discountRate = discountRate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	//calculate the payment amount which is( amount - discountRate percentage )
	@Override
	protected double calculatePayment() {
		
		double cashAmount = (amount - discountRate*amount/100);
		 return cashAmount;
	}

	@Override
	public String toString() {
		return "Cash [discountRate=" + discountRate + ", CustomerName=" + CustomerName + ", Customermerld="
				+ Customermerld + ", amount=" + amount + "]";
	}

}
