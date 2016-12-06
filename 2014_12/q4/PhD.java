class PhD extends PostGrad{
	int credits = 12;
	String name = "PhD Student";
	PhD(){}
	PhD(String n){ name = n;}
	public String toString(){
		return "I am " + name + " and I need " + credits + " credits";
	}
}