import java.io.*;

class Teacher implements Serializable{
	private static int numOfTeacher = 0;

	Teacher(){
		numOfTeacher++;
	}

	public static int getNumOfTeacher(){
		return numOfTeacher;
	}

}