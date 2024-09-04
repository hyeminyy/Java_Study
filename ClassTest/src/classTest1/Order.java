package classTest1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private Customer customer; // 고객 정보
    private Item[] items; // 주문 제품들
    private int[] quantities; // 주문 제품 수량들
    private String[] orderDates; // 주문 일자들
    private int count = 0; // 배열 인덱스

    // 생성자
    public Order(Customer customer) {
        this.customer = customer;
        this.items = new Item[10];
        this.quantities = new int[10];
        this.orderDates = new String[10];
    }
    
    private String nowDate() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(formatter);
    }

    // 아이템을 주문에 추가하는 메서드
    void addItem(Item item, int quantity) {
        if (count < items.length) { 
            items[count] = item;
            quantities[count] = quantity;
            orderDates[count] = nowDate();
            item.reduceStock(quantity);
            count++;
        } else {
            System.out.println("주문이 가득 찼습니다.");
        }
    }

    // 총 가격 계산
    double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice() * quantities[i];
        }
        return total;
    }

    // 주문 요약 출력
    void printOrderSummary() {
        for (int i = 0; i < count; i++) {
            System.out.println("Item: " + items[i].getName() +
                               ", Quantity: " + quantities[i] +
                               ", Price: " + items[i].getPrice() +
                               ", Date: " + nowDate() +
                               ", stockQuantity: " + items[i].getStockQuantity());
        }
        System.out.println("Total: " + calculateTotal());
    }
}
