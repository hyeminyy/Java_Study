package classTest;

import java.util.Iterator;

class Student6{
	private  String name;
	private int age;
	private String subject[];
	private int score[];
	private static int count; 
	//static을 사용해 생성된 student 객체의 수를 관리할 수 있음
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public Student6() {
		count++;
	}
	
	public static int getCount() { //학생 수를 반환하는 정적 메소드
		System.out.println("총 " +count + "명");
		return count;
	}
	public void printStudent() { //학생 정보를 출력하는 메소드
		/*
    	 * 이름 = **, 나이 = **
    	 * 과목1 = **, 점수1 = **
    	 * 과목2 = **, 점수2 = **
    	 * ... 등으로 출력
    	 */
		System.out.println("이름 : " + name + ",나이 : " + age );
		for (int i = 0; i < subject.length; i++) {
			 System.out.println("과목" + (i + 1) + " = " + subject[i] + ", 점수" + (i + 1) + " = " + score[i]);
		}
		
	}
}
public class 실습6_1객체생성자미사용 {
	
	static void showStudents(Student6[] students) { //학생들 정보 출력
		for (int i = 0; i < students.length; i++) {
	            students[i].printStudent();
	            System.out.println();   
		}
		//printStudent 메소드를 호출하여 정보를 출력한다.
    }
	
	  static Student6 makeStudent(String name, int age, String[] subjects, int[] scores, int value) {
	    	//이름,나이,과목배열,점수배열을 입력받아 student 객체를 생성한다.
		   //생성된 객체는 setter 메소드를 사용하여 각 멤버 변수를 초기화한 후 반환한다.
		  Student6 s = new Student6();
	    	s.setName(name);
	    	s.setAge(age);
	    	s.setSubject(subjects);
	    	s.setScore(scores);
	        return s;
	    } //showStudents() 메소드 구현 - printStudent() 메소드를 호출하여 구현
public static void main(String[] args) {
		String[] subjects = {"수학","국어", "영어","과학","역사"};
		
		  Student6[] students = {
		            makeStudent("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, -1),
		            makeStudent("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
		            makeStudent("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
		            makeStudent("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
		            makeStudent("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1)
		        };
		//학생정보출력
		  showStudents(students);
		  Student6.getCount();
		
	}
}
