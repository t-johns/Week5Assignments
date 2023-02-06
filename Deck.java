package week5Lab.OOP;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Deck {
  
  public Deck() {}
      
  ArrayList<String> suits = new ArrayList<>(); //assign suits
  int values; // assign values
  ArrayList<String> listOfCards = new ArrayList<>(); //combine into list of cards

  
  public ArrayList<String> makeDeck() { //create a whole deck
    this.suits =  addSuits(); //create suits
    this.values = addValues(); //create values
    this.listOfCards = assembleDeck(suits, values); //add them together
    
    System.out.println(suits);
    System.out.println(values);
    System.out.println(listOfCards);
    for (String card: listOfCards) {
      System.out.println(card);
    }
    return listOfCards;
  }
  
  public ArrayList<String> assembleDeck(ArrayList suits, int values) {  //create method that returns array list of created cards  
    //ArrayList<String> deck = new ArrayList();
    ArrayList<String> deck = new ArrayList<>();
    
    for (String suit: this.suits) { //loop through suits array
      for (int i=2; i<=13; i++) { // loop through int values
        StringBuilder card = new StringBuilder();
        int cardValue = i; //assign value to card
        
        card = card.append(cardValue + " of " + suit); //assign value and suit to string
        String newCard = card.toString(); // string buffer for card String
        deck.add(newCard); //add card to deck
        card.delete(0, card.length()); //clear stringBuilder          
      }   
    }
    return deck;
  }

  public int addValues() {
    for (String suit: this.suits) {
      this.values += 13;
    }
    return values;
  }
  
  public ArrayList<String> addSuits() {
    this.suits.add("Diamonds");
    this.suits.add("Clubs");
    this.suits.add("Hearts");
    this.suits.add("Spades");
    return this.suits;
  }
  
  public void introduce() {
    System.out.println("Pffffft, pffffft... The dealer shuffles his cards.");
    //System.out.println("Got a set of " +  deckSize + " here if you'd like.");
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
  



  }





