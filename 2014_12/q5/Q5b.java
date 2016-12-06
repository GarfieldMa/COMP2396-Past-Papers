import javax.swing.*;
import java.awt.*;

public class Q5b{
	public static void main(String[] args) {
		JButton jb1 = new JButton("B1");
		JButton jb2 = new JButton("B2");
		JButton jb3 = new JButton("B3");
		JButton jb4 = new JButton("B4");
		JButton jb5 = new JButton("B5");

		JPanel panel = new JPanel();

		panel.add( jb1 );
		panel.add( jb2 );
		panel.add( jb3 );
		panel.add( jb4 );
		panel.add( jb5 );
		
		JFrame frame = new JFrame();
		frame.setSize( 300, 300 );
		frame.add( panel );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );

	}
}