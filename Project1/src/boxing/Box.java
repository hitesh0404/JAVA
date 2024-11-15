package boxing;

public class Box {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Primitive to Wrapper
		int a =12;
		Integer A = Integer.valueOf(a);
		
		
		Integer B = new Integer(a);
		
		
		Integer C = a;
		
		a = A.intValue();
		a = B;
	
	}

}
