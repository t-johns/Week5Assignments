package week5Lab.OOP;
// Create class that implements AsteriskLogger


public class AsteriskLogger implements Logger {

    //String 
  @Override
  public void log(String log) {
    System.out.println("***" + log + "***\n"); //print message
  }

    @Override
    public void error(String error) {
      boxDecor(error);
    }

    @Override
    public void info(String info) {
      // TODO Auto-generated method stub
      
    }
    
    public void boxDecor(String message) {
      double boxFormat = message.length() * 1.25; // format message with some degree of fit
      double spacing = (boxFormat - message.length()) / 2;
      
      surroundSpace(spacing);
      
      for (int i=0; i<=boxFormat; i++) { //pre message format
        System.out.print("*");
      } System.out.print("\n");
      
      System.out.println("***Error: " + message + "***"); //print message    
      
      surroundSpace(spacing);

      for (int i=0; i<=boxFormat; i++) { //closing format
        System.out.print("*"); 
      } System.out.print("\n"); //extra line for space    
      
      return;     
    }
    
    public void surroundSpace(double spacing) { //create indent based on (message.length()*1.25 - message.lenth) / 2
      // may look silly if message gets too long due to increasing side indents but never message indent
      for (int i=0; i<spacing ; i++) {
        System.out.print(" ");        
      }
      return;
      
    }
}


