class Square extends Rectangle{
	double size;
	// public Square( double w, double h ){
	// 	size = w * h;
	// }
	public Square( double s ){
		super( Math.sqrt(s), Math.sqrt(s) );
		size = s;
		System.out.println( "Square" );
	}
}