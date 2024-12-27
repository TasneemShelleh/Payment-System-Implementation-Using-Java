/* Tasneem Ali Shelleh 
   1220439
   Lab section : 4 */
package finalProject;
import java.util.*;

public class CreditCard extends CustomerPayment implements Payable {
	private double chargingFee;
	private Date expiryDate;
	
	public CreditCard() {}

	public CreditCard(String customerName,int customerId,double amount,double chargingFee, Date expiryDate) {
		super(customerName,customerId,amount);
		this.chargingFee = chargingFee;
		this.expiryDate = expiryDate;
	}

	public double getChargingFee() {
		return chargingFee;
	}

	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	//calculate the payment amount which is( amount + chargingFee )
	@Override
	protected double calculatePayment() {
		return amount + chargingFee;
	}
	
	//check if the CreditCard payment is authorized or not
	//that it is authorized if its expireDate is greater than or equal to the current date
	@Override
	public boolean isAuthorized(){
		return expiryDate.compareTo(new Date()) >= 0;	
	}

	@Override
	public String toString() {
		return "CreditCard [chargingFee=" + chargingFee + ", expiryDate=" + expiryDate + ", CustomerName="
				+ CustomerName + ", Customermerld=" + Customermerld + ", amount=" + amount + "]";
	}

	
	

}
