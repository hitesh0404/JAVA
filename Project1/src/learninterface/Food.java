package learninterface;

public interface Food {
	void ingredients();
	void discount();
	
	default void shop() {
		System.out.println("XYZ Shop");
	}
	
}
