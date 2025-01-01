package war;

public class Distribute {
	public Deck draw() {
		Card card = this.card.remove(0);
		
		return card;
	}
/* 
 * Deck 
 * 
 */
}
/*
 * take the first half of the deck and 
 * give it to player 1 and take the second half 
 * and give it to player 2 using the length method
 * to find total length and then break it into two parts
 */