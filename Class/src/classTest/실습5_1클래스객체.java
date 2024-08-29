package classTest;

class Person{
	String name;
	int age;
	float weight;
	
	void show() {
		System.out.println("name : " + name +" , "+ "age = " + age + " , "+"weight = " + weight);
	}
}
public class 실습5_1클래스객체 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "홍길동";
		p.age = 25;
		p.weight = 60.56f;
		
		p.show();
		
		Person p2 = new Person();
		p2.name = "강감찬";
		p2.age = 55;
		p2.weight = 62.34f;
		
		p2.show();
	}
}
