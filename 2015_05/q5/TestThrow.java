public class TestThrow extends Exception{
	public static void main(String[] args) throws Exception{
		System.out.println( new TestThrow().test() );
	}

	public  String test() throws Exception{
		try{
			throw new TestThrow();
		}
		catch (Exception e) {
			return test2();
		}
		finally{
			return "B";
		}
	}

	public String test2() throws Exception{
		try{
			throw new TestThrow();
		}
		catch (Exception e) {
			throw new TestThrow();
		}
		finally{
			return "A";
		}
	}
}