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
        super(600, 400, 1); 

        addObject(titleLabel, 240, 100);
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
        addObject(elephant, 498, 50);

        elephant.setLocation(523,133);
        elephant.setLocation(502,78);
        Label label2 = new Label("Use <-- and --> to Move", 40);
        addObject(label2,323,218);
        label2.setLocation(218,196);
        Label label = new Label("Press <space> to start the game", 40);
        addObject(label,322,301);
        label.setLocation(288,284);
    }
}
