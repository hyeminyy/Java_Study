package PolymorphismTest;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	int annual_sales; //연간 판매 실적
	@Override
	public void calcSalary() {
		System.out.println("Salesman 보너스 = 기본급 * 판매 수당");
		
	}

	@Override
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
		
	}
	
}
class Consultant extends Employee{
	int num_project; //컨설팅 참여 수
	@Override
	public void calcSalary() {
		System.out.println("Consultant  급여 = 기본급 + 컨설팅 특별 수당");
		
	}

	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
		
	}
	
}
class Manager extends Employee{
	int num_team; //관리 팀 수
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급 * 12 *6 ");
		
	}
}

class Director extends Manager{

	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
		
	}
	
}

public class HRSTest {
//	public static void calcTax(Salesman s){
//		
//	}
//	public static void calcTax(Consultant c){
//		
//	}
//	public static void calcTax(Director d){
//		
//	}
//	
	
	public static void calcTax(Employee e){
		if(e instanceof Salesman) {
			Salesman s = (Salesman) e;
			s.annual_sales = 6500000;
			System.out.println("Salesman  입니다. " + s.annual_sales);
			//System.out.println(e.annual_sales); //Employee에 annual_sale가 없기 때문에 , 해당하는 곳에서 받아와야함 (Salesman)
			
		}else if(e instanceof Manager) {
			Manager m = (Manager) e;
			m.num_team = 5;
			System.out.println("Manager 입니다. " + m.num_team);
			//System.out.println(e.num_team);// error
		}else if(e instanceof Consultant) {
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("Consultant 입니다. "+c.num_project);
			//System.out.println(e.num_project); //error
		}else {
			System.out.println("Employee 입니다.");
		}
		
}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		if(s.equals(c)) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		System.out.println("----------------------------");
		calcTax(s);
		calcTax(c);
		calcTax(d);
	}
}
