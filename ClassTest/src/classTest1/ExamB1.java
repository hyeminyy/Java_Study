package classTest1;

public class ExamB1 {
    public static void main(String[] args) {
        // 아이템 생성
        Item laptop = new Item("노트북", 1200.00, 10);
        Item tshirt = new Item("티셔츠", 20.00, 50);
        Item phone = new Item("핸드폰", 3520.00, 100);
        Item headphones = new Item("헤드폰", 540.00, 70);
        Item mouse = new Item("마우스", 50.00, 30);

        // 고객 생성
        Customer boy = new Customer("홍길동", "부산", 21);
        Customer girl = new Customer("계백", "양산", 24);
        Customer kid = new Customer("이순신", "대구", 10);

        // 주문 생성
        Order order1 = new Order(boy);
        order1.addItem(laptop, 1);
        order1.addItem(tshirt, 2);

        // 고객 정보 출력
        boy.show();
        order1.printOrderSummary();
        
        System.out.println("------------------------------------------------------------------------");
        
        Order order2 = new Order(girl);
        order2.addItem(laptop, 3);
        order2.addItem(tshirt, 1);
        
        girl.show();
        order2.printOrderSummary();
        
        System.out.println("------------------------------------------------------------------------");
        
        
        Order order3 = new Order(kid);
        order3.addItem(phone, 1);
        order3.addItem(headphones, 1);
        
        kid.show();
        order3.printOrderSummary();


    }
}
