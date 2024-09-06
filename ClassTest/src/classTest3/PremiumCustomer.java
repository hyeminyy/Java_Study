package classTest3;

import classTest3.Customer;

public class PremiumCustomer extends Customer {
	
	static final double DISCOUNT_RATE = 0.1; //10% 할인
	
	public PremiumCustomer(String cname, String city, int age) {
		super(cname, city, age);
	}

	public double applyDiscount(double totalAmount) {
		return totalAmount * ( 1 - DISCOUNT_RATE);
	}

}
