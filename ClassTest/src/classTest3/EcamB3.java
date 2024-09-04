package classTest3;

 interface Discountable {
	double getDiscountedPrice(double price);
	
}
class SeasonalDiscount implements Discountable{
	private double discountRate;//객체가 만들어질 때 값이 설정
	//Discountable 인터페이스 메서드 구현
	
	public SeasonalDiscount(double discountRate) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiscountedPrice(double price) {
		return price * (1 - discountRate);
	}
}

abstract class Customer{
	private String name;
	abstract double applyDiscount(double totalAmount);
}

class RegularCustomer extends Customer{
	public RegularCustomer(String name) {
		// TODO Auto-generated constructor stub
	}

	double applyDiscount(double totalAmount) {
		return totalAmount;
	}
}
class PremiumCustomer extends Customer{
	static final double DISCOUNT_RATE = 0.1;

	public PremiumCustomer(String name) {
	}

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount * (1-DISCOUNT_RATE);
	}
}

public class EcamB3 {
	public static void main(String[] args) {
		Customer regularCustomer = new RegularCustomer("홍길동");
		Customer premiumCustomer = new PremiumCustomer("김유신");
		double itemPrice = 100.0;
		
		Discountable seasonalDiscount = new SeasonalDiscount(0.2);
		//20%할인
		double discountedPrice = seasonalDiscount.getDiscountedPrice(itemPrice);
		//일반 고객의 주문 생성
		double regularCustomerFinalPrice = regularCustomer.applyDiscount(discountedPrice);
		//프리미엄 고객의 주문 생성
		double premiumCustomerFinalPrice = premiumCustomer.applyDiscount(discountedPrice);
		
		
		
		
	}
}
