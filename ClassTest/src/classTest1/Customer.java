package classTest1;

public class Customer {
	private String cname;
	private String city;
	private int age;
	
	 public Customer(String cname, String city, int age) {
	        this.cname = cname; 
	        this.city = city; 
	        this.age = age;
	    }
	public void show() {
		System.out.println("name = " + cname + " city = " + city + " age = " + age);
	}
}
