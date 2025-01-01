package war;

public class Card {// making the base variables for a card
	String name;
	String suit;
	int value;
	
	Card(String name, String suit, int value){
		this.name = name;
		this.suit= suit;
		this.value = value;
	}
//make the getters and setters in order to have 
//the program create the cards and give them there values
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {//puts all the variables together
		System.out.println(this.name +" of " + this.suit +"--" + this.value);
	}
	
	
	
}
