package classTest3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private Customer customer; // 고객명
    private Item[] items; // 주문 제품들
    private int[] quantities; // 주문 제품 수량들
    private String[] orderDates; // 주문일자들
    private int count = 0; // 배열 인덱스
    
    public Order(Customer customer) {
        this.customer = customer;
        this.items = new Item[10]; // 초기 크기를 설정합니다.
        this.quantities = new int[10];
        this.orderDates = new String[10];
    }

    private String nowDate() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(formatter);
    }

    void addItem(Item item, int quantity) {
        if (count < items.length) { // 배열이 꽉 차지 않았는지 확인
            items[count] = item;
            quantities[count] = quantity;
            orderDates[count] = nowDate();
            item.reduceStock(quantity); // 주문 시 재고 감소
            count++;
        } else {
            System.out.println("주문이 꽉 찼습니다.");
        }
    }

    double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice() * quantities[i];
        }
        return total;
    }
    
   


    void printOrderSummary() {
        for (int i = 0; i < count; i++) {
            Item item = items[i];
           
            System.out.println("Item: " + item.getName() +
                               ", Quantity: " + quantities[i] +
                               ", Price: " + item.getPrice() +
                               ", Date: " + orderDates[i] +
                               ", stockQuantity: " + item.getStockQuantity() +
                               (item instanceof Clothing ? ((Clothing) item).toString() : ""));
        }
        System.out.println("Total: " + calculateTotal());
        
      
    }
}
