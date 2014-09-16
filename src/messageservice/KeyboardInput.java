
package messageservice;

import java.util.Scanner;


public class KeyboardInput implements MessageInput {
    //this class will implement the interface and get the keyboard input
    
    
    
    //override method
    @Override
    public String getMessage() {
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter in a message: ");
        
        //Don't assume input will only be a single line 
        return keyboard.nextLine();
    }
}
