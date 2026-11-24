import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class BlackjackGUI {

	public BlackjackGUI() {
		
		JFrame frame = new JFrame("Blackjack");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100 , 0));
		frame.add(panel);
		panel.setLayout(new BorderLayout());
		JLabel dealerLabel = new JLabel("DEALER", JLabel.CENTER);
		panel.add(dealerLabel, BorderLayout.NORTH);
		dealerLabel.setForeground(Color.white);
		JLabel playerLabel = new JLabel("PLAYER", JLabel.CENTER);
		panel.add(playerLabel, BorderLayout.SOUTH);
		playerLabel.setForeground(Color.white);
		JPanel dealerCards = new JPanel();
		dealerCards.setOpaque(false);
		panel.add(dealerCards, BorderLayout.CENTER);
	}
}
