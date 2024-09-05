package classTest3;

interface Discountable {
    double getDiscountedPrice(double price); // 할인된 가격을 반환하는 메서드
}

class SeasonalDiscount implements Discountable {
    private double discountRate; // 객체가 만들어질 때 설정되는 할인율

    // 생성자: 할인율을 인자로 받아 설정
    public SeasonalDiscount(double discountRate) {
        this.discountRate = discountRate; // 할인율 초기화
    }

    // Discountable 인터페이스의 메서드를 구현, 가격에 할인율을 적용해 반환
    @Override
    public double getDiscountedPrice(double price) {
        return price * (1 - discountRate); // 할인 적용된 가격 반환
    }
}

abstract class Customer {
    private String name; // 고객 이름

    // 할인율을 적용한 최종 금액을 반환하는 추상 메서드
    abstract double applyDiscount(double totalAmount);
}

class RegularCustomer extends Customer {
    // 생성자: 고객 이름을 받아 초기화
    public RegularCustomer(String name) {
        // 이름 설정 생략
    }

    // 할인 없이 금액을 그대로 반환하는 메서드
    @Override
    double applyDiscount(double totalAmount) {
        return totalAmount; // 할인 없이 그대로 반환
    }
}

class PremiumCustomer extends Customer {
    static final double DISCOUNT_RATE = 0.1; // 프리미엄 고객의 고정 할인율 10%

    // 생성자: 고객 이름을 받아 초기화
    public PremiumCustomer(String name) {
        // 이름 설정 생략
    }

    // 프리미엄 고객에게 고정 할인율을 적용해 금액을 반환하는 메서드
    @Override
    double applyDiscount(double totalAmount) {
        return totalAmount * (1 - DISCOUNT_RATE); // 할인율 적용된 가격 반환
    }
}

public class EcamB3 {
    public static void main(String[] args) {
        Customer regularCustomer = new RegularCustomer("홍길동"); // 일반 고객 생성
        Customer premiumCustomer = new PremiumCustomer("김유신"); // 프리미엄 고객 생성
        double itemPrice = 100.0; // 상품 가격 100

        Discountable seasonalDiscount = new SeasonalDiscount(0.2); // 20% 계절 할인 생성
        double discountedPrice = seasonalDiscount.getDiscountedPrice(itemPrice); // 계절 할인을 적용한 가격 계산

        // 일반 고객의 최종 금액 (할인 없음)
        double regularCustomerFinalPrice = regularCustomer.applyDiscount(discountedPrice);

        // 프리미엄 고객의 최종 금액 (10% 할인 추가 적용)
        double premiumCustomerFinalPrice = premiumCustomer.applyDiscount(discountedPrice);
        
        // 결과 출력
       // premiumOrder.printOrderSummary();
    }
}
