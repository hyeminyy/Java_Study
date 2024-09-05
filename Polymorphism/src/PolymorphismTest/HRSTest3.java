package PolymorphismTest;

public class HRSTest3 {
	public static void main(String[] args) {
		Salesman s1 = new Salesman();
		Consultant s2 = new Consultant();
		Director s3 = new Director();
		
		
		Object m1 = new Manager();
		Object m2 = new Manager();
		Object m3 = new Manager();
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
