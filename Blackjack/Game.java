import java.util.Scanner;

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
		boolean playerTurn = true;
		boolean blackjack = false;
		Scanner scan = new Scanner(System.in);
		String userInput;
		
		deck.buildDeck();
		deck.shuffleDeck();
		
		dealer.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		
		dealer.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		
		dealer.printVisibleHand();
		System.out.println("Dealers Visible Total: " + dealer.getVisibleHand());
		System.out.println();
		
		player1.printHand();
		System.out.println("Players Total: " + player1.getHandValue());
		System.out.println();
		
		//blackjack 
		if(player1.getHandValue()== 21) {
			if(dealer.getHandValue() == 21) {
				System.out.println("Both Dealer and Player has Blackjack! Push");
				playerTurn = false;
				blackjack = true;
			}else {
				System.out.println("BLACKJACK! Player wins!");
				System.out.println();
				playerTurn = false;
				blackjack = true;
			}
				
		}
		
		while (playerTurn) {
			System.out.println("Would you like to hit or stand?: ");
			userInput = scan.nextLine();
			if (userInput.equalsIgnoreCase("Hit")) {
				player1.addCard(deck.dealCard());
				player1.printHand();
				System.out.println("Players Total: " + player1.getHandValue());
				if(player1.getHandValue()> 21) {
					playerTurn = false;
				}else if (player1.getHandValue() == 21) {
					System.out.println("Player has 21!");
					playerTurn = false;
				}
			}else if (userInput.equalsIgnoreCase("Stand")) {
				playerTurn = false;
			}else {
				System.out.println("Invalid input.");
			}
			System.out.println();
		}
		//dealers turn
		if(player1.getHandValue() <= 21 && !blackjack) {
			
			dealer.printHand();
			System.out.println("Dealers Total: " + dealer.getHandValue());
			System.out.println();
			
			//check initial hand for blackjack
			if (dealer.getHandValue()== 21) {
				System.out.println("Dealer has Blackjack! Dealer wins.");
				blackjack = true;
			}else {
		
				while(dealer.getHandValue()< 17) {
				dealer.addCard(deck.dealCard());
				dealer.printHand();
				System.out.println("Dealers Total: " + dealer.getHandValue());
				System.out.println();
				
				}
			}
		}
		if(!blackjack) {
			determineWinner();
		}
	}
	private void determineWinner() {
		if (player1.getHandValue()> 21) {
			System.out.println("Player busts, dealer wins");
		}else if(dealer.getHandValue() > 21 ) {
			System.out.println("Dealer busts, player wins");
		}else if(player1.getHandValue()> dealer.getHandValue()) {
			System.out.println("Player wins");
		}else if(player1.getHandValue()< dealer.getHandValue()) {
			System.out.println("Dealer wins");
		}else if(dealer.getHandValue()==player1.getHandValue()) {
			System.out.println("Push");
		}
	}
}
		
