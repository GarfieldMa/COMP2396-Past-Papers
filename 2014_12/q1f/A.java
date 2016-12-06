class A{
	A(){
		System.out.print( "A: " + (this instanceof I) + " " );
	}

	public static void main(String[] args) {
		new C();
		// new A();
	}
}