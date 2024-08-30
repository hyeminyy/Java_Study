package classTest2;

public class StaticMethodTest {
	int num = 123;
	static int num2 = 1234;
	public static void main(String[] args) {
		
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2('!');

	}

	public static void print1() {
		 int num = num2;
		System.out.println("hello");
	}
	
	public void print2(char i) {
		int num3 = num;
		System.out.println("java" + i);
	}
	
	
}

