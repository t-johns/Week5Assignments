package week5Lab.OOP;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck implements Logger {
  
  
  Integer deckSize;
  ArrayList<String> suits = new ArrayList<>();
  ArrayList<Integer> values = new ArrayList<>();

  
  public Deck() {}
  
  public Deck(Integer deckSize) {
    this.deckSize = deckSize;
    //this.values = value;
    this.suits.add("Diamonds");
    this.suits.add("Clubs");
    this.suits.add("Hearts");
    this.suits.add("Spades");
  }
  
  public void Deck(Integer deckSize, ArrayList suits, ArrayList values) {
    this.deckSize = deckSize;
    this.suits =  suits;


    System.out.print(suits);
    this.values = values;
  }
  public void createCard() {
    
  }
  
  public void introduce() {
    System.out.println("Pffffft, pffffft... The dealer shuffles his cards.");
    System.out.println("Got a set of " +  deckSize + " here if you'd like.");
    System.out.print("Got them all, ");
    for (String suit: this.suits) {
      System.out.print(suit + ", ");
    }
    System.out.print("all ready to do your bidding");
    //System.out.println("What say you, value goes low of " + values.get(0) + "high of " );
    //values.get((values.get((values.length()-1)))));
    
  }

  
  public String greeting(String greeting) { //erased info method
    introduce();
    return greeting;
  }  
  
  @Override
  public void log(String log) {
    System.out.println("***" + log + "***");
    
  }
  public void error(String error) {
    Date date = new Date();
    for (int i=0; i<error.length(); i++) {
      System.out.print(error.charAt(i) + " "); //spaced output
    }
    System.err.println(date.toString() + "Error - " + ": " + error);
  }


  }





