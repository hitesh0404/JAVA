package learninterface;

public class BankMain {

	public BankMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Bank() {
//			public void bankDetails() {
//				
//			}
//		};
//		lambda 
		
		Bank sbi=()->System.out.println("Bank Details");
		sbi.bankDetails();
		
		Bank icici=()->{
			System.out.println("this is ICICI Bank");
		};
		icici.bankDetails();
	}
}
