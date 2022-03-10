

public class UI {
	
	

	
	
	public static void startUI() {
		System.out.println("How would you like to run the program?");
		System.out.println("1. Single threaded.");
		System.out.println("2. Un-bounded Threading.");
		System.out.println("To make your choice type the number and press enter:");
	}
	
	public static void tryAgainUI() {
		System.err.println("Invalid input. PLease try again");
		System.out.println("1. Single threaded.");
		System.out.println("2. Un-bounded Threading.");
		System.out.println("To make your choice type the number and press enter:");
	}
	
	
	
	public static void factoringMenu() {
		System.out.println("Enter a number to be factored:");
	}
	
	public static void endMenu() {
		System.out.println("Would you like to run the program again");
	}

}
