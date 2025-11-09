import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //move left at 15 speed
        move(-15);
        
        //reset banana when at the end of the screen
        if(getX() <=0){
            resetBanana();
        }
        //end game if touch hero
        if(isTouching(Hero.class)){
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
        
    }
    public void resetBanana(){
        //randomly move banana to one of two spots
        int num = Greenfoot.getRandomNumber(2);
        if(num ==0){
            setLocation(600, 100);
        }
        else{
            setLocation(600, 300);
        }
    }
}
