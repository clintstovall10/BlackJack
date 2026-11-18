
public class Game {
	Deck deck;
	Card card;
	Player player1;
	Dealer dealer;
	
	
	public Game () {
		this.deck = new Deck();
		this.card = new Card();
		this.player1 = new Player();
		this.dealer = new Dealer();
	}
	public void startGame() {
		//deal dealer card
		//deal player card
		//deal dealer card hidden
		//deal player card
		//hit or stand?
		deck.buildDeck();
		deck.shuffleDeck();
		dealer.setCard(deck.dealCard());
		player1.setCard(deck.dealCard());
		System.out.printf("Dealer card: %s\n" , dealer.getCard());
		System.out.printf("Player card: %s\n" , player1.getCard());
		
	}
}
