package PolymorphismTest;

class DD{
	String name;
	public DD(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		DD d = (DD)obj;
		if(name.equals(d.name)) {
			return true;
		}return false;
	}
	
//	public boolean equals(DD d) { //veroding 으로 해줘야 함
//		if(name.equals(d.name)) {
//			return true;
//		}return false;
//	}
} 

public class HRSTest2 {
	public static void main(String[] args) {
		DD a = new DD("A");
		DD b = new DD("B");
		DD c = new DD("C");
		
		a=c;
		
		System.out.println((a==b)?"equal" : "not equal");
		// == => 문자열이 같니 ?  => 다릅니다.
		System.out.println((a==c)?"equal" : "not equal");
		// == => 문자열이 같니 ?  => 같습니다.
		System.out.println(a.equals(b) ? "equal" : "not equal");
		//equals => 주소값이 갔니 ? => 다릅니다.
	}
}
