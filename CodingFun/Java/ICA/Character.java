import java.util.concurrent.TimeUnit;

/**
 * Martin Lillo
 */

public class Character     
{
    private String fullBody;

    public Character()
    {
        this.fullBody = ":-)";
    }

    public Character(String fullBody)
    {
        this.fullBody = fullBody;
    }

    public void PrintCharacter(){
        System.out.print(fullBody);
    }

    public void moveDown(int numSpace)
    {
        for (int i = 0; i < numSpace; i++)
        {
            System.out.println();
            PrintCharacter();
            System.out.print('\u000C');
            waitSomeTime(500);
        }
    }

    public void moveRight(int numSpace)
    {
        for (int i = 0; i < numSpace; i++)
        {
            PrintCharacter();
            System.out.print(" ");
            waitSomeTime(500);
        }
    }
    
    public void waitSomeTime(int numMilliseconds)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(numMilliseconds);
        }
        catch (InterruptedException e)
        {
            System.out.println("Premature awakening");
        }
    }
}
