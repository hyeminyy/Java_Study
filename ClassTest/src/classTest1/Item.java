package classTest1;

public class Item {
    private String name; // 제품명
    private double price; // 제품 가격
    private int stockQuantity; // 재고량

    // 생성자
    public Item(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    public int getStockQuantity() {
		return stockQuantity;
	}

	// 재고 감소 메서드
    void reduceStock(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
        } else {
            System.out.println("재고 부족");
        }
    }

    // 재고 증가 메서드
    void increaseStock(int quantity) {
        stockQuantity += quantity;
    }

    // 제품 정보를 출력하는 메서드
    public void show() {
        System.out.println("name = " + name + ", price = " + price + ", stockQuantity = " + stockQuantity);
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", stockQuantity=" + stockQuantity + "]";
    }


}
