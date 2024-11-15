package statickeyword;

public class StaticMain {

	public static void main(String []args) {
		// TODO Auto-generated constructor stub

		Employee emp1 = new Employee(1001,"Raj");
		Employee emp2 = new Employee(1001,"Raju");
		Employee emp3 = new Employee(1001,"Rakesh");
		Employee.ceo = "Ramesh";
		Employee.changeName("Rahul");
		System.out.println(emp1.ceo);
		System.out.println(emp2.ceo);
		System.out.println(emp3.ceo);
		

		for (int i=0;i<100;i++) {
		new Count();
		}
		
		
		
	}

}
