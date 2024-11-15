package multithreading;

public class MT4 {

	public MT4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}).start();
		
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("World");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}).start();
		
		
		
	}

}
