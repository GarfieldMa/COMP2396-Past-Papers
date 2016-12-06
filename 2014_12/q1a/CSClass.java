public class CSClass{
	public static void main(String[] args) {

		Student[] cs0396 = new Student[ 2 ];

		cs0396[ 0 ] = new Student();
		cs0396[ 0 ].name = "Kevin";
		cs0396[ 0 ].id = 12345;

		cs0396[ 1 ] = new Student();
		cs0396[ 1 ].name = "Haoyuan";
		cs0396[ 1 ].id = 67890;

		for ( int i = 0; i < 2; i++ ) {
			System.out.println( cs0396[ i ].name + " with id " + cs0396[ i ].id );
		}
	}
}