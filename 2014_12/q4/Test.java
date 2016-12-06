public class Test{
	public static void main(String[] args) {
		Msc m = new Msc( "Alice" );
		PhD p = new PhD( "Bob" );
		PostGrad pg1 = m;
		PostGrad pg2 = p;

		System.out.println( m + "\n" + p + "\n" + pg1 + "\n" + pg2 );
		System.out.println( "I am " + pg1.name + " and I need " + pg1.credits + "credits" );
		System.out.println( "I am " + pg2.name + " and I need " + pg2.credits + "credits" );
		System.out.println( "I am " + m.name + " and I need " + m.credits + "credits" );
		System.out.println( "I am " + p.name + " and I need " + p.credits + "credits" );
	}
}