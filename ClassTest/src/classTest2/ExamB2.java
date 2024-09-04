package classTest2;

public class ExamB2 {
	public static void main(String[] args) {
		//아이템 생성
		Item laptop = new Electronics("노트북", 1200.00, 10, 2);
		Item phone = new Electronics("핸드폰", 2200.00, 100, 6);
		Item headphones = new Electronics("헤드셋", 1100.00, 30, 3);
		Item tshirt = new Clothing("티셔츠", 20.00, 50, "XL", "RED");
		Item pants = new Clothing("바지", 10.00, 50, "L", "BLACK");
		
		
		//고객 생성
		Customer boy = new PrermiumCustomer("홍길동", "부산", 21, 0.2f);
		Customer girl = new Customer("계백", "양산", 21);
		
		Order order1=new Order(boy);
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);
		
		System.out.println(boy.toString());
		order1.printOrderSummary();
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
	
		Order order2=new Order(girl);
		order2.addItem(tshirt, 3);
		order2.addItem(phone, 1);
		
		
		System.out.println(girl.toString());
		order2.printOrderSummary();
	}
}
