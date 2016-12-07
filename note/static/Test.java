
public class Test {
	
	public static void foo(){
		System.out.println( "meo~" );
	}
	// Constructor
	public Test(){
		
	}

	public static void main(String[] args){
		Test t = new Test();
		t.foo();
		Test.foo();
	}
	
}