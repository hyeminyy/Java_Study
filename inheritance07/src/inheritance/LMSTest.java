package inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("김혜민");
		e.setAge(26);
		e.setDept("입학처");
		
		p.setName("김푸름");
		p.setAge(25);
		p.setSubject("빅데이터");
		
		s.setName("박안녕");
		s.setAge(27);
		s.setMajor("자료구조");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}

	
}
