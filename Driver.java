import java.util.Scanner;

/**
 * This class will be used to initiate the other classes 
 * 
 * @author Chad Andreniuk
 * 
 */
public class Driver {

  public static void main(String[] args) {

    Backend be = new Backend();

    boolean loopStatus = true;

    while (loopStatus) {
      Scanner kb = new Scanner(System.in);
      UI.startUI();

      int processing_choice = kb.nextInt();

      UI.factoringMenu();

      int entered_num = kb.nextInt();

      if (processing_choice == 1) {
        be.unthreaded(entered_num);
      }
      if (processing_choice == 2) {
        be.unbounded(entered_num);
      }

      UI.endMenu();
      String choice = kb.next();

      if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
        loopStatus = false;
        kb.close();
      }

    }

  }
}