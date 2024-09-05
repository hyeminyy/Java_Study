package PolymorphismTest;

interface Ploy{
	void test();
}
class GrandParent implements Ploy{

	@Override
	public void test() {
		System.out.println("grandparent test 호출");
		
	}
	public void test1() {
		System.out.println("grandparent test 1 호출");
		
	}
}

class Parent implements Ploy{

	@Override
	public void test() {
		System.out.println("parent test 호출");
		
	}
	public void test1() {
		System.out.println("parent test 1 호출");
		
	}
	
	
}

class Child implements Ploy{

	@Override
	public void test() {
		System.out.println("child test 호출");
		
	}
	
	public void test1() {
		System.out.println("child  test 1 호출");
		
	}
	public void test2() {
		System.out.println("child  test 2 호출");
		
	}
	
}
public class PolymorphismTest {
	private static void print(Ploy obj) {
		obj.test();
	}
	public static void main(String[] args) {
		Child obj = new Child();
		Parent pobj = new Parent();
		GrandParent gobj = new GrandParent();
		
		print(obj);
		print(pobj);
		print(gobj);
		
		
		
		
		
		
		
		
	}
}
