
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
		
		dealer.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		
		dealer.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		
		dealer.printHand();
		System.out.println("Dealers Visible Total: " + dealer.getVisibleHand());
		//System.out.println("Dealers Total: " + dealer.getHandValue());
		System.out.println();
		player1.printHand();
		System.out.println("Players Total: " + player1.getHandValue());
		
		
		
	}
}
