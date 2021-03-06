package cards;

public class Card {

	private int num;
	private int suit;

	// card constructor
	public Card(int num, int suit) {
		this.num = num;
		this.suit = suit;
	}

	//returns the card number
	public int getNum() {
		return num;
	}

	// returns the card's suit's numerical value
	public int getSuit() {
		return suit;
	}

	// returns the card as a string, combining its numerical value and suit
	public String toString() {
		switch(suit) {
		case 0:
			return num+"C";
		case 1:
			return num+"D";
		case 2:
			return num+"H";
		case 3: 
			return num+"S";
		}
		return null;
	}
	
	//compares two cards' values
	public int compareTo(Card other) {

        if (num == other.num && suit == other.suit) {
            return 0;
        }

        if (getSuit() == other.getSuit()) {
            if (getNum() > other.getNum())
                return 1;
            else
                return -1;
        }

        if (getNum() == other.getNum()) {
            if (getSuit() > other.getSuit())
                return 1;
            else
                return -1;
        } else {
            if (getNum() > other.getNum())
                return 1;
            return -1;
        }
    }

}
