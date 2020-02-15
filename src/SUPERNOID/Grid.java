package SUPERNOID;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {

    //Padding of 10
    public static final int PADDING = 10;

    //memorise the background
    private Picture picture;

    private Picture heart1;
    private Picture heart2;
    private Picture heart3;

    //initiate the constructor of the grid
    public Grid() {
        picture = new Picture(PADDING, PADDING, "resources/Images/general/field_900x900_c.jpg");
        heart1 = new Picture(665, 650, "resources/Images/general/heart_62x62.png");
        heart2 = new Picture(725, 650, "resources/Images/general/heart_62x62.png");
        heart3 = new Picture(788, 650, "resources/Images/general/heart_62x62.png");
        picture.draw();
        drawAllHearts();
    }

    public void drawAllHearts() {
       heart1.draw();
       heart2.draw();
       heart3.draw();
    }

    public void deleteheart3() {
        heart3.delete();
    }

    public void deleteheart2() {
        heart2.delete();
    }

    public void deleteheart1() {
        heart1.delete();
    }


}
