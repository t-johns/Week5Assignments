package week5Lab.OOP;
// Create class that implements AsteriskLogger


public class AsteriskLogger implements Logger {

    //String 
  @Override
  public void log(String log) {
    System.out.println("***" + log + "***"); //print message
  }


    
    @Override
    public void error(String error) {
      createWithBorders(error);
    }
    
    public void createWithBorders(String message) {
      double boxFormat = message.length() * 1.25; // format message with some degree of fit
      double spacing = (boxFormat - message.length()) / 2;
      
      borderIndent(spacing); //indent border spacing
      createBorder(message);

      System.out.println("***Error: " + message + "***"); //print message    
      
      borderIndent(spacing);
      createBorder(message);

      return;     
    }
    public void createBorder(String message) {
      double messageLength = message.length()*1.25;
      String border = "";
      
      for (int i=0; i <= messageLength; i++) {
        border += "*";
      }
      System.out.println(border);
    }
    
    public void borderIndent(double spacing) { //create indent based on (sS= message.length()*1.25 - message.lenth) / 2
      // may look silly if message gets too long due to increasing side indents but never 
      for (int i=0; i<spacing ; i++) {
        System.out.print(" ");        
      }
      return;
    }
}


