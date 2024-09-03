package inheritance;

public class LMSTest2 {
	public static void main(String[] args) {
		Employee e = new Employee("김혜민", 26, "입학처");
		Professor p = new Professor("김푸름", 24, "빅데이터");
		Student s = new Student("박유빈", 27, "자료구조");
		
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
