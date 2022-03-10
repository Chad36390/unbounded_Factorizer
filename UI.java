/**
 * This class will be used to send all the UI messages
 * 
 * @author Chad Andreniuk
 * 
 */
public class UI {

  /**
   * This method prints the menu that starts the whole program
   */
  public static void startUI() {
    System.out.println("How would you like to run the program?");
    System.out.println("1. Single threaded.");
    System.out.println("2. Un-bounded Threading.");
    System.out.println("To make your choice type the number and press enter:");
  }


  
  /**
   * This method print the UI that is shown 
   * if a user enters an invalid input to the startUI function 
   */
  public static void tryAgainUI() {
    System.err.println("Invalid input. PLease try again");
    System.out.println("1. Single threaded.");
    System.out.println("2. Un-bounded Threading.");
    System.out.println("To make your choice type the number and press enter:");
  }


  /**
   * This method print the UI that is shown 
   * when selecting what number the user wants to factor
   */
  public static void factoringMenu() {
    System.out.println("Enter a number to be factored:");
  }

  /**
   * This method prints the UI after the computations has finished
   * This simply asks if the program would like to be run again
   */
  public static void endMenu() {
    System.out.println("Would you like to run the program again");
  }

}
