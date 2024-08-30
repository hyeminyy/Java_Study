package classTest;

class Person0{
	String name;
	int age;
	float weight;
	void takeOff() {
		System.out.println("hello");
	}
	
	
}

public class 실습5_class예제 {
	public static void main(String[] args) {
		int a= 10;
		int arr[] = new int[5];
		Person0 mark16 = new Person0();
		mark16.takeOff();
		Person0 p = new Person0();
		p.name = "홍길동";
		p.age = 25;
		p.weight = 65.45f;
		
		p.takeOff();
		}
}
