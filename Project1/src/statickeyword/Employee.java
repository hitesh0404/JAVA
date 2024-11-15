package statickeyword;

public class Employee {

	static String ceo="Muneeb";
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void changeName(String name) {
		ceo=name;
		
	}
}
