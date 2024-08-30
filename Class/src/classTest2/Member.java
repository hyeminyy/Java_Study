package classTest2;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		this("guest");
	}
	
	
	public Member(String name) {
		this(name,0);
	}


	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return name + " : " + age;
	}


//	public void setName(String name) {
//		name = name;
//	}
	
	public static void main(String[] args) {

		Member m1 = new Member();
		Member m2 =new Member("Amy");
		Member m3 =new Member("Amy",26);
		
		
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

	
	
}

