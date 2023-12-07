import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Tiffany Ho
 * @version December 4 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 390, 1); 

        addObject(titleLabel, 300, 75);
        prepare();
    }

    public void act()
    {
        //start the game if user presses the space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);

        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 180);

        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,300,250);

        Label label = new Label("Press <space> to start the game", 40);
        addObject(label,300,300);
        Label label3 = new Label("Avoid the bombs!", 40);
        addObject(label3,300,353);
    }
}
