class D extends C{
	public int x = 5;
	public static void goo( int n ){//function overload
		System.out.println( "D" + n + " goo" );
	}
	public void goo(){
		System.out.println( "D goo" );
	}
	public void hoo(){
		System.out.println( x + " " + super.x );
		super.hoo();
	}
}