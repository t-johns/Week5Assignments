package week5Lab.OOP;
// Create class that implements AsteriskLogger

public class AsteriskLogger implements Logger {

      //String 
    @Override
    public void log(String log) { //print log with '***' on each side
      System.out.println("***" + log + "***");
    }
      
    @Override
    public void error(String error) { 
      createWithBorders(error); //pass error to createWithBorders for formatting
    }
    
    public void createWithBorders(String message) {
      double boxFormat = message.length() * 1.25; 
      double spacing = (boxFormat - message.length()) / 2;
      
      borderIndent(spacing); //indent border spacing
      createBorder(message); //create border based on length of message
      System.out.println("***Error: " + message + "***"); //print message    
      
      borderIndent(spacing); //spacing
      createBorder(message); //border
      return;     
    }
      
    public void createBorder(String message) { //create Border around message
      double messageLength = message.length()*1.25; // 1.25 * length to format with some degree of fit
      
      String border = ""; //empty string to fill border
      
      for (int i=0; i <= messageLength; i++) {
        border += "*"; // add '*' for range in messageLength
      }
      System.out.println(border); //print border in relation to length of message
    }
    
    public void borderIndent(double spacing) { //create indent based on (message.length()*1.25 - message.length()) / 2)
      // will look less and less natural due to ever-expanding flat indent amount
      for (int i=0; i<spacing ; i++) { //uses extra length from createWithBorders() to find difference (/2) to indent
        System.out.print(" ");        
      }
      return;
    }
}


