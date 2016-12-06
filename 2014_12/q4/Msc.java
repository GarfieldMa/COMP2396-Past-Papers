class Msc extends PostGrad{
	int credits = 24;
	String name = "MSc Student";
	Msc(){}
	Msc(String n){ name = n;}
	public String toString(){
		return "I am " + name + " and I need " + credits + " credits";
	}
}