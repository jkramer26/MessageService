
package messageservice;

import java.util.Scanner;


public class KeyboardInput implements MessageInput {
    //this class will implement the interface and get the keyboard input
    
    //create object to get keyboard input
    Scanner keyboard = new Scanner(System.in);
    String keyboardInput;
    
    //override method
    @Override
    public String getMessage() {
        System.out.println("Enter in a message: ");
        keyboardInput = keyboard.next();
        
        return keyboardInput;
    }
}
