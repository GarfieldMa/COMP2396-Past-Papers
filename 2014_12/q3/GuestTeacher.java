class GuestTeacher extends Teacher{

	static int numOfGuestTeacher = 0;

	GuestTeacher(){
		numOfGuestTeacher++;
	}

	public static int getNumOfGuestTeacher(){
		return numOfGuestTeacher;
	}
}