// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(560, 560, 1);
        /* the message displayed*/
        showText("Congratulations, You Win!", 260, 260);
    }

    /**
     * 
     */
    public void showText(String message, int x, int y)
    {
        /* setting up the text*/
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
