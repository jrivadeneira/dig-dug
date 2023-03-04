package actors;

import data.Vektor;

public class Asteroid extends Actor{
	
	
	double radius;
	String emotion;
	int lives;
	
	public Asteroid(Vektor position, Vektor velocity, double radius, String emotion, int lives) {
		this.position = position;
		this.velocity = velocity;
		this.radius = radius;
		this.emotion = emotion;
		this.lives = lives;
	}
	

}
