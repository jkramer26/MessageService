
package messageservice;


public class ConsoleOutput implements MessageOutput { 
    
    
    //this class will push input to the console
    @Override
    public void sendMessage(String message) {
        
        System.out.println("Here is your console output " );
        System.out.println(message);
    }
    
//    //test class
//    public static void main(String[] args) {
//        ConsoleOutput c = new ConsoleOutput();
//        
//        c.sendMessage("Hi");
//    }
}
