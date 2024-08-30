package classTest;

class Student7{
	private String name;
	private int age;
	private String subjects[];
	private int score[];
	private static int count;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubjects(String[] subject) {
		this.subjects = subject;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public static void setCount(int count) {
		count ++;
	}
	
	public Student7(String name, int age, String[] subjects, int[] score, int value) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.score = score;
        count++;
    }
	
	public Student7() {
		count++;
	}
	public static void getNumberStudents() { //학생 수를 반환하는 정적 메소드 (static)
		System.out.println("총 " + count + "명");
	}
	public void printStudent() {
		System.out.println("이름 : " + name + " ,나이 : " + age);
		for (int i = 0; i < subjects.length; i++) {
			System.out.println("과목 : " + (subjects[i]) + " ,점수 : " + (score[i]));
		}
		System.out.println("");
	}
	public static void showStudents(Student7[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].printStudent();
			System.out.println("");
		}
	}
}
public class 실습6_2생성자사용 {

	public static void main(String[] args) {
		String[] subjects = {"수학","국어","영어","과학","역사"};
		
		Student7[] students = {
			new Student7("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, -1),
			new Student7("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
			new Student7("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
			new Student7("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
			new Student7("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1)
		};
		Student7.getNumberStudents();
		Student7.showStudents(students);
	}
}
