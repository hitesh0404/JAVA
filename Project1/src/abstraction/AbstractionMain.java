package abstraction;
class Bus extends Vehicle{
	public void stop() {
		System.out.println("Bus Stopped");
	}
	public void start() {
		System.out.println("Bus Started");
	}
}
class Bike extends Vehicle{
	public void start() {
		System.out.println("Bike Started");
	}
	public void stop() {
		System.out.println("Bike Stopped");
	}
}
public class AbstractionMain {

	
	public static void main(String []args) {
	
			Bus bus = new Bus();
			bus.start();
			Bike bike = new Bike();
			bike.start();
			// TODO Auto-generated constructor stub
			
			Vehicle truck =new Vehicle() {
				public void start() {
					System.out.println("Truck Started");
					
				}
				public void stop() {
					System.out.println("Truck stopped");
					
				}
				
				
			};

			Vehicle train =new Vehicle() {
				//this is an anonymous inner class
				public void start() {
					System.out.println("train Started");
					
				}
				public void stop() {
					System.out.println("train Stoped");
				}
				
			};
			
			train.start();
			train.stop();
			truck.start();
		
	}
}
