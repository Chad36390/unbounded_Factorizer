import java.util.Scanner;



public class Driver {

    public static void main(String[] args) {
    	
        Scanner kb = new Scanner(System.in);
        Backend be = new Backend();
       


        
        boolean loopStatus = true;
        
       while(loopStatus){
    	   
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
        if(choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
        	loopStatus = false;
        }

    }

  }
}