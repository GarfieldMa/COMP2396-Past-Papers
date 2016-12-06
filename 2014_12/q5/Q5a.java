import javax.swing.*;
import java.awt.*;

public class Q5a{
	public static void main(String[] args) {
		JButton jb1 = new JButton("B1");
		JButton jb2 = new JButton("B2");
		JButton jb3 = new JButton("B3");
		JButton jb4 = new JButton("B4");
		JButton jb5 = new JButton("B5");

		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 300, 300);
		frame.add( jb1, BorderLayout.NORTH );
		frame.add( jb2, BorderLayout.EAST );
		frame.add( jb3, BorderLayout.SOUTH );
		frame.add( jb4, BorderLayout.WEST );
		frame.add( jb5, BorderLayout.CENTER );
		frame.setVisible( true );

	}
}