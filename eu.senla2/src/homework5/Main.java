package homework5;

import java.awt.Container;

import homework5.model.Deck;
import homework5.model.ShipOneDeck;
import homework5.model.containershapes.ContainerType;

public class Main {
	public static void main(String[] args) {
	
		Container smallC = new ContainerImpl (10, ContainerType.SMALL);
		Container smallC1 = new ContainerImpl (10, ContainerType.SMALL);
		Container bigC = new ContainerImpl (10, ContainerType.BIG);
		Container bigC1 = new ContainerImpl (10, ContainerType.BIG);
		
		Deck deck = new Deck (Container []);
		
		Deck []decks = new Deck [2];
		Deck deck = new Deck();
		decks[0]= deck;
		
		ShipOneDeck shipOneDeck = new ShipOneDeck (decks);
		
		
		
	}
}
