package week5Lab.OOP;

public class App {

  public static void main(String[] args) {

    Logger spacedLogger = new Deck(); //create spacedLogger object from Deck() object    
    
    Logger asteriskLogger = new AsteriskLogger(); //asignment logger
    asteriskLogger.log("This is the first test");
    asteriskLogger.error("How about another test?"); //print message with "***" on either side.
    
    
    Logger logger = new Deck(52);
    ((Deck) logger).introduce();


    
  }

}
