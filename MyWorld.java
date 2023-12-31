import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world our hero lives in.
 * 
 * 
 * @author (Tiffany Ho) 
 * @version (November 2023)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    SimpleTimer bombTimer = new SimpleTimer();
    boolean gameIsOver = false;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 390, 1, false);
        
        //Create the elephant object.
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);

        createApple();
        createEnemy();
    }
    
    /**
     * End game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        gameIsOver = true;
    }
    
    public void newEnemy()
    {
        createEnemy();
    }
    
    /**
     * Increase score.
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void decreaseScore()
    {
        score = score - 1;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
        
        if(score < 0)
        {
            gameOver();
        }
    }
    
    /**
     * Creates a new apple at random location at the top o the screen.
     */
    public void createApple()
    {
        Blueberry blueberry = new Blueberry();
        blueberry.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(blueberry, x, y);
    }
    
    public void createEnemy()
    {
        Enemy enemy = new Enemy();
        enemy.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(enemy, x, y);
    }
    
    public void act() {
        if(!gameIsOver) {
            if(bombTimer.millisElapsed() > 3000){
                bombTimer.mark();
                createEnemy();
            }
        }
    }
}
