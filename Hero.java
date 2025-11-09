import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean atTop = false;
    boolean lastState = false;
    public void act()
    {
        //toggle hero position on mouse click
        if (Greenfoot.isKeyDown("space")) {
            if (!lastState) { // key was just pressed
                atTop = !atTop; // flip state
                lastState = true;
            }
        } else {
            lastState = false; // reset when key released
        }
        if(atTop){
            setLocation(100,100);
        }
        else{
            setLocation(100, 300);
        }
        
    }
}
