package week5Lab.OOP;

public class SpacedLogger implements Logger {

  @Override
  public void log(String log) { //add space in between each character of string argument passed to it
    String spacedMessage = ""; // empty variable
    
    for (int i=0; i<log.length(); i++) { //loop log.length to add log.CharAt(index) + " "
      spacedMessage += log.charAt(i) + " ";
    }
    System.out.println(spacedMessage.trim());     

    return;
  }

  @Override
  public void error(String error) { // put "ERROR: " in front of spaced message
    String errorMessage = "ERROR: ";
    System.out.println(errorMessage + spaceString(error));
    
    return;
  }
  
  public String spaceString(String word) { //put " " between every character in a string
    String bufferString = word;
    String spacedWord = "";
    
    for (int i=0; i<bufferString.length(); i++) {
      if (i == bufferString.length()) { //make sure int i won't go out of index bounds for word max length
        return spacedWord; //return from loop
      } else {
      spacedWord += bufferString.charAt(i) + " ";
      } }
    
    return spacedWord.trim(); //return word with spaces, no space on end
  }

}
