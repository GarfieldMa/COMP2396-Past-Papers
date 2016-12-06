class Test{
	public static void main(String[] args) {
		for ( int i = 1; i >= -1; --i ) {
			try{
				int a =1 / i;
				System.out.println( a );
			}
			catch (Exception e) {
				System.out.println( "error" );
			}
		}
	}
}