import java.util.*;

class CardGame{
	private ArrayList<Card> deck;
	private ArrayList<Player> players;

	public void startGame(){

		createDeck();
		shuffleDeck();
		createPlayer( 4 );
		distributeCards( 12 );

		boolean endOfGame = false;

		ArrayList<Card> cardsOnTable = new ArrayList<Card>();

		while( !endOfGame ){
			for ( Player p : players ){
				p.play( cardsOnTable );
				endOfGame = checkEndOfGame();
				if ( endOfGame ){
					break;
				}
			}
		}
	}

	private void createDeck(){}
	private void shuffleDeck(){}
	private void createPlayer( int n ){}
	private void distributeCards( int n ){}
	private boolean checkEndOfGame(){ return true; }

}