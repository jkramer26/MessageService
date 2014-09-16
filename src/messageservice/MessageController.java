
package messageservice;



public class MessageController {
    //message output variable
    //message input variable
    //composition has-a relationship
    private MessageInput input;
   
    
    //composition has-a relationship
    //way to implement abstract class
    private MessageOutput output;
    
     public MessageController(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }
    
    
    public void doMessageProcess() {
        String message = input.getMessage();
        
        output.sendMessage(message);
        
    }
}
