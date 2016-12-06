public class Java extends RuntimeException{
	static Java java;
	public Java(){}
	public Java(Java java){ this.java = java; }
	public Java java(){ return java; }
	public static void main(String[] args) {
		Java.java = new Java();
	}
}