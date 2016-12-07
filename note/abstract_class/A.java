abstract class A{
	abstract public A foo();
	public static void main(String[] args) {
		A a = new D();
		a.foo();
		((C) a).goo();
		D d = (D)a;
		d.hoo();
	}
}