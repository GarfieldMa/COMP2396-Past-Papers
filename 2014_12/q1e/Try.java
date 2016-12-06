public class Try{
	static void check( final int d )
		throws NonDigitException{
		if ( d < '0' || d > '9' ){
			throw new NonDigitException();
		}
	}

	public static void main(String[] args) {
		int d = 11;
		try{
			check(d);
		}
		catch (NonDigitException e){
			e.printStackTrace();
		}
	}
}