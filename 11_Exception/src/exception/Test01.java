package exception;

public class Test01 {
public static void test03() throws Exception{
	System.out.println("test03");
	try {
		int arr[] = new int[3];
		arr[3] = 30;

	} catch (Exception e) {
		System.out.println("Errorrrrrrrrrrrrrrr");
		e.printStackTrace();
	}
	}
	public static void test02() throws Exception {
		System.out.println("test02");
		test03();
	}
	public static void test01() throws Exception {
		System.out.println("test01");
		test02();
	}

	public static void main(String[] args) throws Exception {
		test01();
		System.out.println("ok");
	}
}
