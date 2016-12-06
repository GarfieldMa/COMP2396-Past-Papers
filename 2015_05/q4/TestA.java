public class TestA{
	static int x;
	static TestA a;
	static TestB b;

	TestA(){
		x++;
	}

	static void runTest(){
		a = new TestA();
		b = new TestB();
	}

	public static void main(String[] args) {
		runTest();
		runTest();
		System.out.println( a.x + b.x );
	}
}