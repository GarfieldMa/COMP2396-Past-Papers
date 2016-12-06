import java.util.*;

class Test{
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for ( int i = 0; i < 4; i++ ){
			arr.add( i );
		}
		arr.remove( 2 );
		System.out.println( arr.get( 2 ) );
		// while ( arr.size() > 0 ){
			System.out.println( arr );
			// arr.remove(0);			
		// }
	}
}