package multithreading;

public class MT3 {

	public MT3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Runnable runnable= new  Runnable() {
			@Override
			public void run() {
				System.out.println("new With Annonimous Inner Class");
				
			}
		};
		
		new Thread(runnable).start();
		
		new Thread(()->System.out.println("Thread with simple")).start();
	}

}
