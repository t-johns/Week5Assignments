package week5Lab.OOP;

public class SpacedLogger implements Logger {

  @Override
  public void log(String log) { //add space in between each character of string argument passed to it
    String spacedMessage = ""; // empty variable
    
    for (int i=0; i<log.length(); i++) { //loop log.length to add log.CharAt(index) + space
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
      if (i == (bufferString.length())) {
        return spacedWord;
      } else {
      spacedWord += bufferString.charAt(i) + " ";
      } }
    
    return spacedWord.trim();    
  }

}
