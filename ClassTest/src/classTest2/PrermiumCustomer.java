package classTest2;

public class PrermiumCustomer extends Customer {
    private float discountRate;

    public PrermiumCustomer(String cname, String city, int age, float discountRate) {
        super(cname, city, age);
        this.discountRate = discountRate;
    }

    public float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }
    


    @Override
    public String toString() {
        return super.toString() + ", Discount Rate: " + discountRate;
    }
}
