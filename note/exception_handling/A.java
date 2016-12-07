import java.io.*;

class A{
	public static void main(String[] args){
		try{
			String input;
			FileReader fin = new FileReader("input.txt");
			FileWriter fout = new FileWriter("output.txt");
			BufferedReader reader = new BufferedReader( fin );
			BufferedWriter writer = new BufferedWriter( fout );
			while( (input = reader.readLine()) != null ){
				System.out.print( input );
				for ( int i = 0; i < 90000; i++ ){
					writer.write( input );
				}
			}	
			reader.close();
			// writer.close();	
		}
		catch( IOException e ){
			e.printStackTrace();
		}
		// System.out.println( "meo~" );
		// finally{

		// }
		// fin.close();
		// fout.close();

	}
}