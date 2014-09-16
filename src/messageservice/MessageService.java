
package messageservice;


public class MessageService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this is the starter class
        
        MessageInput input = new KeyboardInput();
        MessageOutput output = new ConsoleOutput();
        
        MessageController controller = new MessageController(input, output);
        
        controller.doMessageProcess();
    }
    
}
