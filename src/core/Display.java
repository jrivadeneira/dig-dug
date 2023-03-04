package core;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Display extends Frame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String []args) {
		System.out.println("Game Start!");
		new Display();
	}
	
	public void setupCloseOperation() {
		this.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
	}
	
	public Display() {
		this.setBackground(Color.BLACK);
		this.setSize(800,600);
		this.setupCloseOperation();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
}
