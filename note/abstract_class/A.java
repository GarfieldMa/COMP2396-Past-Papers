abstract class A{
	abstract public A foo();
	public static void main(String[] args) {
		C c = new E();
		c.hoo();
		// a.foo();
		// ((C) a).goo();
		// D d = (D)a;
		// d.hoo();

	}
}