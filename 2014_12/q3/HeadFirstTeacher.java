public class HeadFirstTeacher{

	public static void main(String[] args) {
		Integer[] quotas = {7,8,9,10};

		Teacher t1 = new Teacher();
		Teacher t2 = new GuestTeacher();
		Teacher t3 = new GuestTeacher();
		Teacher t4 = new Teacher();
		Teacher t5 = new Teacher();
		Integer[] duplicateQuotas = quotas;

		t1 = t4;
		t4 = null;
		t2 = t3;
		Teacher[] teahcerAssignments = { t1, t5 };
		manage( t2 );

		//count
		System.out.println( "number of teacher created: " + Teacher.getNumOfTeacher() );
		System.out.println( "number of GuestTeacher created: " + GuestTeacher.getNumOfTeacher() );
	}

	static void manage(Teacher t){
		GuestTeacher ta = new GuestTeacher();
		Teacher tb = t;
	}
}