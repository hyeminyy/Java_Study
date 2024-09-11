package exception;

public class Test02 {
	int battery = 0;
	
	public void charge(int time) {
		if(time < 0){
			time = 0;
			try {
				throw new NagativeNumberException();
			} catch (NagativeNumberException e) {
				e.printStackTrace();
			}
		}
		battery += time;
		System.out.println("현재 베터리 : " + battery);
	}
	public static void main(String[] args) {
		Test02 test = new Test02();
		test.charge(30);
		test.charge(20);
		test.charge(-10);
	}
}
