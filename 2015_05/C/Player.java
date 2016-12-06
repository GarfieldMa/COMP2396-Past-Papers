import java.util.*;

class Player{
	private ArrayList<Card> deck = new ArrayList<Card>();
	private Card prevCard;
	public void addCard( Card c ){ 
		deck.add( c );
	}
	public void play( ArrayList<Card> cardsOnTable){

		//code here

	}
	public int cardsInHand(){
		return deck.size();
	}
}