class PostGrad{
	int credits = 12;
	String name = "PostGraduate Student";
	PostGrad(){}
	PostGrad(String n){ name = n;}
	public String toString(){
		return "I am " + name + " and I need " + credits + " credits";
	}
}