package multithreading;



public class MT5 {

	public MT5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		Thread t1= new Thread(()->{
		
			for (int i = 1; i <= 100; i++) {
				c.increment();
			}
				
		});
				
		Thread t2 = new Thread(()->{
			
			for (int i = 1; i <= 100; i++) {
				c.increment();
			}
				
		});
		t2.start();
		t1.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===========================");
		System.out.println(c.count);

	}

}
