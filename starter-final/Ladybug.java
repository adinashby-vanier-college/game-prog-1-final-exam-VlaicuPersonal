// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* calling the functions*/
        move();
        /* chechcking if its won, transition and play sound*/
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
        if (isGameLost()) {
            transitionToGameLostWorld();
        }
    }

    /**
     * 
     */
    public void move()
    {
        /* making the bug move*/
        if (Greenfoot.isKeyDown("down")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(2);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(2);
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        /* verifying if bug toches the ending location*/
        Actor finishLocation = getOneIntersectingObject(FinishLocation.class);
        if (isTouching(FinishLocation.class)) {
            Greenfoot.playSound("win.wav");
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        /* verifying if bug toches ball*/
        Actor finishLocation = getOneIntersectingObject(CannonBall.class);
        if (isTouching(CannonBall.class)) {
            Greenfoot.playSound("lose.wav");
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWonWorld()
    {
        /* transitioning to the win screen*/
        World myWorld = getWorld();
        myWorld.stopped();
        World gameWonWorld =  new  GameWonWorld();
        gameWonWorld.started();
        Greenfoot.setWorld(gameWonWorld);
    }

    /**
     * 
     */
    public void transitionToGameLostWorld()
    {
        /* transitioning to the win screen*/
        World myWorld = getWorld();
        myWorld.stopped();
        World gameLostWorld =  new  GameLostWorld();
        gameLostWorld.started();
        Greenfoot.setWorld(gameLostWorld);
    }
}
