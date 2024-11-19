// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        List<CannonBall> cannonBalls = getWorld().getObjects(CannonBall.class);
        touching();
    }

    /**
     * 
     */
    public void touching()
    {
        /* playing the sound*/
        if (isTouching(Ladybug.class)) {
            Greenfoot.playSound("lose.wav");
        }
    }
}
