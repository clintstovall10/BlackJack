import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class BlackjackGUI {
 
	private Game game;

	public BlackjackGUI(Game game) {
		this.game = game;
		game.initialDeal();
		JFrame frame = new JFrame("Blackjack");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100 , 0));
		frame.add(panel);
		panel.setLayout(new BorderLayout());
		JLabel dealerLabel = new JLabel("DEALER", JLabel.CENTER);
		dealerLabel.setFont((new Font ("Arial", Font.BOLD, 15)));
		panel.add(dealerLabel, BorderLayout.NORTH);
		dealerLabel.setForeground(Color.white);
		JLabel playerLabel = new JLabel("PLAYER", JLabel.CENTER);
		playerLabel.setFont((new Font ("Arial", Font.BOLD, 15)));
		playerLabel.setForeground(Color.white);
		JPanel dealerCards = new JPanel();
		dealerCards.setOpaque(false);
		panel.add(dealerCards, BorderLayout.CENTER);
		dealerCards.add(createCard(game.dealer.getCard(0)));
		dealerCards.add(createHiddenCard());
		JPanel playerCards = new JPanel();
		playerCards.setOpaque(false);
		playerCards.add(createCard(game.player1.getCard(0)));
		playerCards.add(createCard(game.player1.getCard(1)));
		JPanel playerArea = new JPanel(new BorderLayout());
		playerArea.setOpaque(false);
		playerArea.add(playerLabel, BorderLayout.NORTH);
		playerArea.add(playerCards, BorderLayout.CENTER);
		panel.add(playerArea, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	public JLabel createCard(Card playingCard) {
		String rank = playingCard.getRank();
		String suit = playingCard.getSuit();
		if (suit.equals("Spades")) {
			suit = "\u2660";
		}else if (suit.equals("Hearts")) {
			suit = "\u2665";
		}else if (suit.equals("Diamonds")) {
			suit = "\u2666";
		}else if (suit.equals("Clubs")) {
			suit = "\u2663";
		}	
		if (rank.equals("Ace")) {
			rank = "A";
		}else if (rank.equals("King")) {
			rank = "K";
		}else if (rank.equals("Queen")) {
			rank = "Q";
		}else if (rank.equals("Jack")) {
			rank = "J";
		}	
		
		
		JLabel card = new JLabel(rank + " " + suit);
		card.setOpaque(true);
		card.setBackground(Color.WHITE);
		if(suit.equals("\u2665")|| suit.equals("\u2666")) {
			card.setForeground(Color.RED);
		}else {
			card.setForeground(Color.BLACK);
		}
		card.setPreferredSize(new Dimension(80,110));
		card.setHorizontalAlignment(JLabel.CENTER);
		card.setFont((new Font("Arial", Font.BOLD, 28)));
		return card;
	}
	public JLabel createHiddenCard() {
		JLabel card = new JLabel("?");
		card.setOpaque(true);
		card.setBackground(Color.BLUE);
		card.setForeground(Color.WHITE);
		card.setPreferredSize(new Dimension(80,110));
		card.setHorizontalAlignment(JLabel.CENTER);
		card.setFont((new Font("Arial", Font.BOLD, 28)));
		return card;
	}
}
