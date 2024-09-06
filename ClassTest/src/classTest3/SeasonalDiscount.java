package classTest3;

import classTest3.Discountable;

public class SeasonalDiscount implements Discountable {
    private double discountRate;

    public SeasonalDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getDiscountedPrice(double price) {
        return price * (1 - discountRate);
    }
}
