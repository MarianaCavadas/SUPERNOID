package SUPERNOID.GameObjects;

import SUPERNOID.Grid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Ball {

    //speed of the ball
    private int SPEED = 1;
    //the start position in X
    private int positionX;
    //the start position in Y
    private int positionY = 785;
    //to memorise the ball
    private Picture picture;
    //memorise if the ball is alive or not
    private boolean alive = false;
    //movement of the ball in axis X
    private double x;
    //movement of the ball in axis Y
    private double y;
    //ball moving
    private static boolean movement = false;

    //start the ball object
    public Ball(Paddle paddle) {
        positionX = paddle.getPositionX() + (paddle.getWidth() / 2 - Grid.PADDING);
        picture = new Picture(positionX, positionY, "resources/Images/general/ball_15x15.png");
        alive = true;
        picture.draw();
    }

    //delete the image of the ball
    public void delete() { picture.delete(); }

    //use to verify the direction of the ball when it hits one block
   public String getMovingDirection() {
        String result = "";
        if (x == -1.0 && y == -1.0) { result = "dirUpLeft"; }
        if (x == 1.0 && y == -1.0) { result = "dirUpRight"; }
        if (x == -1.0 && y == 1.0) { result = "dirDownLeft"; }
        if (x == 1.0 && y == 1.0) { result = "dirDownRight"; }
        return result;}

    //draw the ball
    public void draw() {
        picture.draw();
    }

    //return if the ball is alive
    public boolean isAlive() {
        return alive;
    }

    public void setAlive() { alive = true; }

    //kill the ball
    public void setDead() { setX(0); setY(-3); move(); setY(0); picture.delete(); stopMovement(); alive = false; }

    //get the Width of the ball
    public int getWidth() { return picture.getWidth(); }

    //get the Height of the ball
    public int getHeight() { return picture.getHeight(); }

    //print the new position of the ball
    public void move() {
        try {
            picture.translate(x, y);
        } catch (Exception e) {
            //FUCK!!!!
        }
    }

  //get the X of the ball
    public int getPositionX() { return picture.getX(); }

    //get the Y of the ball
    public int getPositionY() { return picture.getY(); }

    //memorise the new axis x
    public void setX(double x) { this.x = x; }

    //memorise the new axis y
    public void setY(double y) { this.y = y; }

    //write the new value in x, to be ready by the canvas.translate
    public double getX() { return x; }

    //write the new value in y, to be ready by the canvas.translate
    public double getY() { return y; }

    //return if the paddle is authorized to move
    public static boolean getMovement() { return movement; }

    //give the authorization for the paddle to move
    public static void setMovement() { movement = true; }

    //make the paddle impossible to move
    public static void stopMovement() { movement = false; }
}
