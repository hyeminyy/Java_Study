package classTest2;

public class ArmorTest2 {
	public static void main(String[] args) {
		Armor suit = new Armor();
		suit = null; //참조가 끊긴 상황 
		//메모리 구조에서 stack에 있는 suit는 null값을 가진다.
		//heap에 생성된 인스턴스는 생성되었지만 스택에 있는 값이 없기 때문에 접근할 방법이 없다.
		suit.setName("mark6");
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
	}
}
