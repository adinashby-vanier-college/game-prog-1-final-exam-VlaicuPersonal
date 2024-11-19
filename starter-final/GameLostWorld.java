// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostWorld extends World
{

    /**
     * Constructor for objects of class GameLostWorld.
     */
    public GameLostWorld()
    {
        super(600, 400, 1);
        /* the message*/
        showText("Game Over!", 260, 260);
    }

    /**
     * 
     */
    public void showText(String message, int x, int y)
    {
        /* here im setting up the text*/
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
