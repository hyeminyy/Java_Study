package classTest2;

public class Customer {
	private String cname;
	private String city;
	private int age;
	
	
	
	 public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(String cname, String city, int age) {
	        this.cname = cname; 
	        this.city = city; 
	        this.age = age;
	    }
	
	 @Override
	    public String toString() {
	        return "Name: " + cname + ", City: " + city + ", Age: " + age;
	    }
}
