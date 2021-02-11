package w5;

import java.util.Arrays;

public class Deck extends Container{
	
	double[] arrdeck;
	
	

	int r =1+ (int)(Math.random()*2);
	
	public void add(double container) {
		if (r==2) {	
	        arrdeck[0] = square;
	        
	        }else {
	        	arrdeck[0]= bigsquare;
	        }
	}
//	public Deck(double[] deck) {
//		super();
//		this.deck = deck;
//	}
	public double[] getDeck() {
		return arrdeck;
	}
	public void setDeck(double[] deck) {
		this.arrdeck = deck;
	}

}
