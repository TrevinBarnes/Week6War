package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {//creating the deck
	List<Card> cards = new ArrayList<Card>();

	Deck() {//sets the limits
		String[] suits = {"Clubs", "Diamonds","Hearts", "Spades"};
		String[] numbers = {"Two", "Three","Four", "Five", "Six", "Seven","Eight",
							"Nine","Ten","Jack","Queen","King"};
		
		for (String suit: suits) {//auto generates the cards based on above limits
			int count = 2;//sets lowest value to 2
			for (String number: numbers) {
				Card card = new Card(number,suit,count);
				this.cards.add(card);
				count++;//increases value until the number "king" is hit (max)
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (Card card: this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {// get formula for shuffle and write out code to shuffle the cards
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {//pulls top card from deck
		Card card = this.cards.remove(0);
		return card;
	}
	
}
