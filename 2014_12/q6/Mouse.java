import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Mouse extends JFrame{

	private int begin_x = -1;
	private int begin_y = -1;
	private int end_x = -1;
	private int end_y = -1;

	private MyPanel p;


	public static void main(String[] args) {
		(new Mouse()).go();
	}

	public void go(){
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		p = new MyPanel();
		MyListener l = new MyListener();
		p.addMouseListener( l );
		p.addMouseMotionListener( l );
		getContentPane().add( p );
		setSize( 300, 300 );
		setVisible( true );
	}

	class MyPanel extends JPanel{

		public void paintComponent( Graphics g ){
			// System.out.println( begin_x + " " + begin_y + " " + end_x + " " + end_y );
			g.setColor( Color.WHITE );
			g.fillRect( 0, 0, 300, 300 );
			if ( begin_x != -1 && begin_y != -1 && end_x != -1 && end_y != -1 ){
				g.setColor( Color.BLACK );
				g.drawLine( begin_x, begin_y, end_x, end_y );
			}
			
		}
	}

	class MyListener implements MouseListener, MouseMotionListener{
		public void mouseClicked( MouseEvent e ){}
		public void mouseEntered( MouseEvent e ){}
		public void mouseExited( MouseEvent e){}
		public void mousePressed( MouseEvent e ){
			begin_x = e.getX();
			begin_y = e.getY();
		}
		public void mouseReleased( MouseEvent e ){
			begin_x = begin_y = end_x = end_y = -1;
			p.repaint();
		}
		public void mouseDragged( MouseEvent e ){
			end_x = e.getX();
			end_y = e.getY();
			p.repaint();
		}
		public void mouseMoved( MouseEvent e ){}
	}
}