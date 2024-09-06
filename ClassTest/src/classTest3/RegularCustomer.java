package classTest3;

import classTest3.Customer;

public class RegularCustomer extends Customer {
	
	static final double REGULARDISCOUNT_RATE = 0.03; //3% 할인
	
	public RegularCustomer(String cname, String city, int age) {
		super(cname, city, age);
	}
	
	public double applyDiscount(double totalAmount) {
		return totalAmount; //일반 고객은 할인 x
	}

}
