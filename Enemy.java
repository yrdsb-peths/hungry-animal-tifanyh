import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Tiffany Ho
 * @version November 6 2023
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int enemySpeed = 1;
    public void act()
    {
        // Add your action code here.
        // Add your action code here.
        int x = getX();
        int y = getY() + enemySpeed;
        setLocation(x, y);
    }
    
    public void setSpeed(int spd)
    {
        enemySpeed = spd;
    }
}
