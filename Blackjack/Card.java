import java.awt.Color;
import java.util.Random;

public class Card {
	
	private String rank;
	private String color;
	private String suit;
	private int value;
	
	public Card (){}
	
	public Card (int value, String suit, String color, String rank) {
		this.rank = rank;
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
	public String getRank() {
		return this.rank;
	}
	@Override
	public String toString() {
		return rank + " of " + suit;
	}
}
