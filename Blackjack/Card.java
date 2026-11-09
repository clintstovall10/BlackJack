import java.awt.Color;
import java.util.Random;

public class Card {
	
	String color;
	String suit;
	int value;
	
	public Card (){}
	
	public Card (int value, String suit, String color) {
		this.color = color;
		this.suit=suit;
		this.value = value;
	}
	
	public int getValue () {
		return this.value;
	}
	public String getSuit() {
		return this.suit;
	}
	public String getColor() {
		return this.color;
	}
	public Card getRandomCard () {
		Random rand = new Random();
		int value = rand.nextInt(10)+1;
		String color;
		String suit;
	
		String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
	
		int randIndex = rand.nextInt(4);
		suit = suits[randIndex];
	
		if (suit.equals("Diamonds") || suit.equals("Hearts")) {
			color = "Red";
		}else {
			color = "Black";
		}
	
		Card card = new Card(value, suit, color);
	
		return card;
	}
}
