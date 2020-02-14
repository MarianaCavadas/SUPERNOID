package SUPERNOID;

import SUPERNOID.GameObjects.ObjFactory;

public class Main {

    //The Beginning of the game, and Interrupted when it finish
    public static void main(String[] args) throws InterruptedException {

        //will instance the game and initialise
        Game game = new Game(150);

        //draw the BackGround and start the game
        game.initScreen();
        game.backGround();
        ObjFactory.getNewBlocks(11,5, 50,0,game);
        ObjFactory.getNewBlocks(11,5, 150,0, game);
        ObjFactory.getNewBlocks(5,3, 250, 120, game);
        game.scoreDraw();
        //game.livesLost(1);
        //game.livesLost(2);
        //game.livesLost(3);
        //game.livesLost(4);
        game.score("010");
        game.start();
    }
}
