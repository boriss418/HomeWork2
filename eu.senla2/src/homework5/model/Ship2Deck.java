package homework5.model;

public class Ship2Deck implements Ship{
	
	private Deck [] decks;

	@Override
	public Deck[] getDeck() {
		// TODO Auto-generated method stub
		return decks;
	}
	public Ship2Deck(Deck[] decks) {
		// TODO Auto-generated constructor stub
		this.decks = decks;
	}
	@Override
	public int getWater() {
		// TODO Auto-generated method stub
		return 0;
	}

}
 