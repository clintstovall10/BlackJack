
public class Dealer {
	private Card [] card;
	private int size;
	public Dealer () {
		card = new Card[20];
		size = 0;
	}
	public void addCard(Card card ) {
		this.card[size] = card;
		size++;
	}
	public void printHand() {
		int i;
		System.out.println("Dealers cards:");
		for (i = 0; i < size; i++) {
			if(i==1) {
				System.out.println("The card is hidden");
			}else {
				System.out.println(card[i]);
			}
		}
	}
	
	public int getHandValue() {
		//count aces
		int aces = 0;
		for(int index =0; index< size;index++) {
				if(card[index].getRank().equals("Ace")) {
					aces++;
					}
		}
				
		//calculate total aces being 1
		int total = 0;
		int i;
		for (i = 0; i < size; i++) {
			if(card[i].getValue() >=10) {
				total+=10;
			}else {
				total += card[i].getValue();
			}
		}
				
		//add 10 for the ace if it doesn't go over 21
		while(aces>0 && total+10<=21) {
			total+=10;
			aces--;
					
		}
		return total;
	}
	
	public int getVisibleHand() {
		int total = 0;
		if(card[0].getValue()>= 10) {
			total+=10;
		}else {
			total+=card[0].getValue();
		}
		
		return total;
	}
	
	
}
