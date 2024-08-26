package chap2_dataType;

import java.util.Scanner;

public class 정수타입연산0826 {

	public static void main(String[] args) {
		
		   // 정수형에서 실수형으로 변환 (묵시적 형 변환)
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int num = sc.nextInt();
		System.out.println("정수변수값 = " + num + "," + "실수변수값 = " + (double)num);
		
		//변수 하나 더 생성
		double num2 = num;
		System.out.println("정수변수값 = " + num + "," + "실수변수값 = " + num2);
	    /*

	    * 정수형 변수를 화면에서 입력받아 double 변수로 변환하여 출력하는 코드를 작성한다.

	    * 출력은 "정수변수값 = **, 실수변수값 = **"

	    */
		System.out.println("-----------------------------------------------");
		System.out.println("실수를 입력하시오");
		double dnum = sc.nextDouble();
		System.out.println("실수변수값 = " + dnum + "," + "정수변수값 = " + (int)dnum);
		
		//변수 하나 더 생성
		int dnum2 = (int) dnum;
		System.out.println("실수변수값 = " + dnum + "," + "정수변수값 = " + dnum2 );

	        // 실수형에서 정수형으로 변환 (명시적 형 변환)

	    /*

	    * 실수형 변수 값을 화면에서 입력받아 정수로 변환하는 코드를 작성한다.

	    * 출력은 "실수변수값 = **, 정수변수값 = **

	    */
//
//		float exchangeRate = 1136.50f;
	
		
	}

}
