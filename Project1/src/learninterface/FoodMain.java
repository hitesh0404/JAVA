package learninterface;

public class FoodMain {
	
	public static void main(String[] args) {
		
		
		Food burger = new Food() {
			public void ingredients() {
				System.out.println("Burger ingredients");
			}
			public void discount() {
				System.out.println("Burger discount");
			}
		};

		Food pizza = new Food() {
			public void ingredients() {
				System.out.println("Pizza ingredients");
			}
			public void discount() {
				System.out.println("Pizza discount");
			}
		};
	
		pizza.ingredients();
		pizza.discount();
		burger.discount();
		burger.ingredients();
		burger.shop();
		
		
		
		
	}

}
