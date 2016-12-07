import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;

public class Client {

	private Socket sock; 
	private InputStreamReader is;
	private BufferedReader reader;

	// Constructor
	public Client(){
		try{
			sock = new Socket("127.0.0.1", 2396);
			is = new InputStreamReader( sock.getInputStream() );
			reader = new BufferedReader( is );
		}
		catch( Exception e ){
			e.printStackTrace();
		}

	}

	public static void main(String[] args){
		Client c = new Client();
		c.go();
	}

	public void go(){
		try{
			String input;
			while ( (input = reader.readLine()) != null ){
				System.out.println( input );
			}
		}
		catch( Exception e ){
			e.printStackTrace();
		}
	}
	
}