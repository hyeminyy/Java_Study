package exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		String name;
		String subject;
		int grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : " );
		name = sc.next();
		System.out.print("과목 : " );
		subject = sc.next();
		System.out.print("성적 : " );
		grade =  sc.nextInt();
		
		System.out.println(" 이름 = " + name +"," + " 과목 = " + subject + ","+" 성적 = " + grade);
		

	}

}
