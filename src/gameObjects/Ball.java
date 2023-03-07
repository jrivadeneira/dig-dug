package gameObjects;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ball {
    // Establish a position

    public int x;
    public int y;

    // Establish a colour

    public Color color;

    // Establish a size

    public int width;
    public int height;

    // Establish a velocity

    public int xVelocity;
    public int yVelocity;

    public Ball(int xPosition, int yPosition, int setWidth, int setHeight, Color setColor) {
        this.x = xPosition;
        this.y = yPosition;
        this.width = setWidth;
        this.height = setHeight;
        this.color = setColor;
        this.xVelocity = 1;
        this.yVelocity = 1;
    }

    public void rotateColor(){

       // Create list of colours to reference

        ArrayList<Color> colorList = new ArrayList<Color>();
        colorList.add(Color.BLUE);
        colorList.add(Color.CYAN);
        colorList.add(Color.DARK_GRAY);
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.ORANGE);
        colorList.add(Color.WHITE);
        colorList.add(Color.YELLOW);
        colorList.add(Color.MAGENTA);
        colorList.add(Color.GRAY);
        colorList.add(Color.LIGHT_GRAY);
        colorList.add(Color.PINK);
        Random random = new Random();

        // Choose colour at random

        Color nextColor = colorList.get(random.nextInt(colorList.size()));

        // Ensure that next colour chosen is not same colour as previous colour

        while(nextColor.equals(this.color)){
            nextColor = colorList.get(random.nextInt(colorList.size()));
        }
        this.color = nextColor;
    }
    public void move() {
        this.x = this.x + this.xVelocity;
        this.y = this.y + this.yVelocity;
        if (this.x > 750) {
            this.x = 750;
            this.xVelocity = -this.xVelocity;
            this.rotateColor();
        }
        if (this.y > 550) {
            this.y = 550;
            this.yVelocity = -this.yVelocity;
            this.rotateColor();
        }
        if (this.x < 0) {
            this.x = 0;
            this.xVelocity = -this.xVelocity;
            this.rotateColor();
        }
        if (this.y < 0) {
            this.y = 0;
            this.yVelocity = -this.yVelocity;
            this.rotateColor();
        }

    }
}