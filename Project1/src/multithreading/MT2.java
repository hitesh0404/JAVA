package multithreading;

class T3 implements Runnable{
		
	@Override
	public void run() {
		System.out.println("Hello World");
	}
}


public class MT2  {

	public MT2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new T3());
		t1.start();
	}

}
