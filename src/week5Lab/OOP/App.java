package week5Lab.OOP;

public class App {

  public static void main(String[] args) { 
    
    Logger asteriskLogger = new AsteriskLogger(); //Instantiate AsteriskLogger()
    asteriskLogger.log("First log test"); //log test
    asteriskLogger.log("Second log test");
    asteriskLogger.error("AsteriskLogger error Test"); //message in and surrounded by ***
    
    Logger spacedLogger = new SpacedLogger(); //instantiate SpacedLogger()
    spacedLogger.log("Spaced logger test."); //SpacedLogger.log()
    spacedLogger.error("THIS IS A SPACEDERROR TEST.");//SpacedLogger.error() test
        
  }

}
