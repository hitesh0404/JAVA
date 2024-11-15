package resturants;

class Vrindavan extends Resturents{
	public void bookTable() {
		System.out.println("Book Table over Call");
	}
	public Vrindavan(int a) {
		super.tableCount=a;
	}

}

public class ResturantMain  {

	public ResturantMain() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vrindavan v1 = new Vrindavan(12);
		
		v1.bookTable();
		System.out.println(v1.tableCount);
	}
	static {
		System.out.println("this is static block ");
	}

}
