import java.util.Random;

public class Deck {
	private Card[] cards;
	private int size;
	private int currentCard;
	
	public Deck () {
		cards = new Card[312];
		size = 0;
		currentCard = 0;
	}
	
	public void shuffleDeck() {
		int index = 1;
		Random rand = new Random();
		int randIndex;
		
		while (index < size) {
			randIndex = rand.nextInt(size);
			Card temp = cards[index];
			cards[index] = cards[randIndex];
			cards[randIndex] = temp;
			index++;
		}
	}
	
	public void buildDeck() {
		int decks = 0;
		while (decks < 6 ) {
		int valueH;
		String suitH = "Hearts";
		String colorH = "Red";

		for (valueH = 1; valueH < 14 ; valueH ++) {
			if (valueH == 1) {
				cards[size] = new Card(valueH, suitH, colorH, "Ace");
				size++;
			}else if (valueH == 11) {
				cards[size] = new Card(valueH, suitH, colorH, "Jack");
				size++;
			}else if (valueH == 12) {
				cards[size] = new Card(valueH, suitH, colorH, "Queen");
				size++;
			}else if (valueH == 13) {
				cards[size] = new Card(valueH, suitH, colorH, "King");
				size++;
			}else {
				cards[size] = new Card(valueH, suitH, colorH, ""+ valueH);
				size++;
			}
		}
		
		int valueS;
		String suitS = "Spades";
		String colorS = "Black";

		for (valueS = 1; valueS < 14 ; valueS ++) {
			if (valueS == 1) {
				cards[size] = new Card(valueS, suitS, colorS, "Ace");
				size++;
			}else if (valueS == 11) {
				cards[size] = new Card(valueS, suitS, colorS, "Jack");
				size++;
			}else if (valueS == 12) {
				cards[size] = new Card(valueS, suitS, colorS, "Queen");
				size++;
			}else if (valueS == 13) {
				cards[size] = new Card(valueS, suitS, colorS, "King");
				size++;
			}else {
				cards[size] = new Card(valueS, suitS, colorS, ""+ valueS );
				size++;
			}
		}
		
		int valueD;
		String suitD = "Diamonds";
		String colorD = "Red";

		for (valueD = 1; valueD < 14 ; valueD ++) {
			if (valueD == 1) {
				cards[size] = new Card(valueD, suitD, colorD, "Ace");
				size++;
			}else if (valueD == 11) {
				cards[size] = new Card(valueD, suitD, colorD, "Jack");
				size++;
			}else if (valueD == 12) {
				cards[size] = new Card(valueD, suitD, colorD, "Queen");
				size++;
			}else if (valueD == 13) {
				cards[size] = new Card(valueD, suitD, colorD, "King");
				size++;
			}else {
				cards[size] = new Card(valueD, suitD, colorD, ""+ valueD );
				size++;
			}
		}
		int valueC;
		String suitC = "Clubs";
		String colorC = "Black";

		for (valueC = 1; valueC < 14 ; valueC++) {
			if (valueC == 1) {
				cards[size] = new Card(valueC, suitC, colorC, "Ace");
				size++;
			}else if (valueC == 11) {
				cards[size] = new Card(valueC, suitC, colorC, "Jack");
				size++;
			}else if (valueC == 12) {
				cards[size] = new Card(valueC, suitC, colorC, "Queen");
				size++;
			}else if (valueC == 13) {
				cards[size] = new Card(valueC, suitC, colorC, "King");
				size++;
			}else {
				cards[size] = new Card(valueC, suitC, colorC, ""+ valueC );
				size++;
			}
		}
		decks++;
		}	
		
	}
	public int getDeckSize() {
		return this.size;
	}
	public void printDeck() {
		for (int i =0; i < size; i++) {
			System.out.println(cards[i]);
		}
	}
	public Card dealCard() {
		if(currentCard >= 312) {
			shuffleDeck();
			currentCard = 0;
		}
		Card card = cards[currentCard];
		currentCard++;
		
		return card;
	}
}
