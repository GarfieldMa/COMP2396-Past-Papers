class Card{
	
	static final char[] SUITS = { 'S', 'H', 'C', 'D' };
	static final char[] VALUES = { '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K', 'A', '2' };

	private int suit;
	private int value;

	public Card( int s, int v ){
		suit = s;
		value = v;
	} 
}