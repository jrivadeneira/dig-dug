package core;

import gameObjects.Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.Color.CYAN;

public class Display extends JFrame{

	// Static Variables
	public static Image buffer;
	public static Graphics2D bufferGraphics;
	public static long frameNumber = 0;

	// Object Properties
	Ball ballOne;
	
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
		this.setTitle("Dig Dug!");
		this.setUndecorated(true);
		this.setVisible(true);
	}

	public void init(){
		buffer = createImage(800,600);
		bufferGraphics = (Graphics2D) buffer.getGraphics();
		this.ballOne = new Ball(0,0, 50, 50, CYAN);
	}

	public void delay (long timeInMs){
		try {
			Thread.sleep(timeInMs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update (Graphics g){
		g.drawImage(buffer, 0, 0, this);
		bufferGraphics.clearRect(0,0, 800,600);
		this.delay(10);
		frameNumber = frameNumber + 1;
	}

	public void drawBall(Ball ball) {
		bufferGraphics.setColor(ball.color);
		bufferGraphics.fillRect(ball.x, ball.y, ball.width, ball.height);

	}

	public void paint (Graphics g){
		if(frameNumber == 0){
			init();
		}
		drawBall(this.ballOne);
		this.ballOne.move();

		update(g);
		repaint();
	}
}
