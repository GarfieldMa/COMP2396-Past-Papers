import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;

public class Server {
	
	private ServerSocket ss;


	static String[] ADVICES = {" Morning ", " Maning ", " Good Good Morning "};
	// Constructor
	public Server(){
		try{
			ss = new ServerSocket( 2396 );
		}
		catch( Exception e ){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception{
		Server s = new Server();
		s.go();
	}

	public void go() throws Exception{
		// Socket
		while( true ){
			Thread t = new Thread( new ClientHandler( ss.accept() ) );
			t.start();
		}
	}

	class ClientHandler implements Runnable{

		private Socket sock;

		public ClientHandler( Socket s ){
			try{
				sock = s;
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}

		public void run(){
			try{
				PrintWriter writer = new PrintWriter( sock.getOutputStream() );
				for ( int i = 0; i < 3; i++ ){
					writer.println( ADVICES[ (int)Math.round( Math.random() * (ADVICES.length - 1) ) ] );
					
					// sleep( 500 );				
				}
				writer.close();
				
			}
			catch( Exception e ){
				e.printStackTrace();
			}
		}
	}

	
}