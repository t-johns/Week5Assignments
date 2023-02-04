package week5Lab.OOP;

public class App {

  public static void main(String[] args) {

    //Logger testing = new Deck(); //create spacedLogger object from Deck() object    
    
    Logger asteriskLogger = new AsteriskLogger(); //Instantiate AsterikLogger()
    asteriskLogger.log("First log test"); //log test
    asteriskLogger.log("Second log test");
    asteriskLogger.error("AsteriskLogger error proof"); //message in and surrounded by ***
    
    Logger spacedLogger = new SpacedLogger(); //instantiate SpacedLogger()
    spacedLogger.log("Spaced logger test."); //SpacedLogger.log()
    spacedLogger.error("THIS IS A spacedLogger.error() TEST.");//SpacedLogger.error() test
        
  }

}
