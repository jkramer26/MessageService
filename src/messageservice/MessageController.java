
package messageservice;



public class MessageController {
    
    
    //message input variable
    //composition has-a relationship
    //use these abstractions so you can use any kind of input
    private MessageInput input;
   
    //message output variable
    //composition has-a relationship
    //way to implement abstract class
    //use these abstractions so you can use any kind of output
    private MessageOutput output;
    
    //constructor that means an object has to have 
    //not exactly sure why you need to have this constructor
     public MessageController(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }
    
    //is delegating work to input object and output object
    //those objects then do the work
    public void doMessageProcess() {
//        String message = input.getMessage();
//        
//        output.sendMessage(message);
        
        //this does what the two other commented out methods do
        output.sendMessage(input.getMessage());
        
    }
    
    
    //should have getters and setters so you can modify objects later in program
    //unless you want an immutable object that can't be changed
    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        this.input = input;
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }
    
    
}
