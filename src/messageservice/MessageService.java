
package messageservice;


public class MessageService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this is the starter class
        
        //need to know about 3 classes so not fully adherent to princple of least knowledge
        //in future will learn about how to only have messagecontroller
        MessageInput input = new KeyboardInput();
        MessageOutput output = new ConsoleOutput();
        
        MessageController controller = new MessageController(input, output);
        
        
        
        controller.doMessageProcess();
    }
    
}
