class C extends B implements I{
	static int x = 3;
	public C foo(){ return new C();}
	public void goo(){
		System.out.println("C goo");
	}
	public void hoo(){
		System.out.println( x );
	}
}