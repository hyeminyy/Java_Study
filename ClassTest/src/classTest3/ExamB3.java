package classTest3;

interface Discountable{
	double getDiscountedPrice(double price);
}

abstract class Item {
    private String name;
    private double price;
    private int stockQuantity;

    public Item(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}

class Electronics extends Item {
    private int madeYear;

    public Electronics(String name, double price, int stockQuantity, int madeYear) {
        super(name, price, stockQuantity);
        this.madeYear = madeYear;
    }

    public int getMadeYear() {
        return madeYear;
    }
}

class Clothing extends Item {
    private int size;

    public Clothing(String name, double price, int stockQuantity, int size) {
        super(name, price, stockQuantity);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class Order {
    private static final int N = 20;
    private Customer customer;
    private Item[] items;
    private int[] quantities;
    private String[] orderDates;
    private int itemCount;
    private Discountable discountPolicy;

    public Order(Customer customer, Discountable discountPolicy) {
        this.customer = customer;
        this.items = new Item[N];
        this.quantities = new int[N];
        this.orderDates = new String[N];
        this.itemCount = 0;
        this.discountPolicy = discountPolicy;
    }

    public void addItem(Item item, int quantity, String date) {
        if (itemCount < N) {
            items[itemCount] = item;
            quantities[itemCount] = quantity;
            orderDates[itemCount] = date;
            itemCount++;
            
            if(item.getStockQuantity() >= quantity) {
            	item.setStockQuantity(item.getStockQuantity()-quantity);
            }else {
            	System.out.println("재고 부족 : " + item.getName());
            	 itemCount--;
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice() * quantities[i];
        }
        return total;
    }

    public void printOrderSummary() {
        System.out.println("고객: " + customer.getCname());
        System.out.println("주문요약:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("- " + items[i].getName() + " x " + quantities[i] + ": W" + (items[i].getPrice() * quantities[i]));
        }
    }

    public void printDiscountDetails() {
        double total = calculateTotal();
        double discountedTotal = discountPolicy.getDiscountedPrice(total);
        double finalTotal = customer.applyDiscount(discountedTotal);

        System.out.println("할인 내역:");
        for (int i = 0; i < itemCount; i++) {
            double originalPrice = items[i].getPrice();
            double seasonDiscount = originalPrice - discountPolicy.getDiscountedPrice(originalPrice);
            double customerDiscount = discountedTotal - customer.applyDiscount(discountedTotal);
            double discountedPrice = originalPrice - seasonDiscount - customerDiscount;

            System.out.println("- " + items[i].getName() + ": 원래 가격 W" + originalPrice + ", 시즌할인금액 W" + seasonDiscount + ", 고객할인금액 W" + customerDiscount + ", 할인 후 가격 W" + discountedPrice);
        }
        System.out.println("할인되어 지불해야 하는 금액 = " + finalTotal);
        System.out.println("------------------------------------------------------------------------------------------------");
    }
}

public class ExamB3 {
    static void showItemsStock(Item[] items) {
        for (Item item : items) {
            if (item != null) {
                System.out.println(item.getName() + " - Stock: " + item.getStockQuantity() + " - Price: " + item.getPrice());
            }
        }
    }

    public static void main(String[] args) { 

        Item[] items = new Item[4];

        items[0] = new Electronics("노트북", 1500, 50, 2023);
        items[1] = new Clothing("티셔츠", 50, 1500, 95);
        items[2] = new Electronics("휴대폰", 800, 100, 2024);
        items[3] = new Clothing("청바지", 80, 100, 90);

        // 모든 아이템의 이름,재고량,가격 출력
        showItemsStock(items);

        // 고객 생성
        Customer regularCustomer = new RegularCustomer("홍길동", "서울", 30);
        Customer premiumCustomer = new PremiumCustomer("강감찬", "부산", 45);

        // 주문 생성 및 계산 (RegularCustomer)
        Order regularOrder = new Order(regularCustomer, new SeasonalDiscount(0.20)); // 20% seasonal discount
        regularOrder.addItem(items[0], 1, "240901");
        regularOrder.addItem(items[1], 2, "240902");
        regularOrder.printOrderSummary();
        regularOrder.printDiscountDetails(); // 할인된 내역 출력

        // 주문 생성 및 계산 (PremiumCustomer)
        Order premiumOrder = new Order(premiumCustomer, new SeasonalDiscount(0.20)); // 20% seasonal discount
        premiumOrder.addItem(items[1], 1, "240901");
        premiumOrder.addItem(items[3], 2, "240903");
        premiumOrder.printOrderSummary();
        premiumOrder.printDiscountDetails(); // 할인된 내역 출력

        // 모든 아이템의 이름과 재고량, 가격 출력
        showItemsStock(items);
    }
}
