import java.util.concurrent.TimeUnit;

public class walker {
//    private String head;
//    private String body;
//    private String hand;
//    private String leftFeet;
//    private String rightFeet;
    private String fullBody;

    public walker(){
//        this.head = "0";
//        this.body = "|";
//        this.hand = "-";
//        this.leftFeet = "/";
//        this.rightFeet = "\\";
        this.fullBody = "( ͡°( ͡° ͜ʖ( ͡° ͜ʖ ͡°)ʖ ͡°) ͡°)";
    }

    public walker(String fullBody){
//        this.head = head;
//        this.body = body;
//        this.hand = hand;
//        this.leftFeet = leftFeet;
        this.fullBody = fullBody;
    }

    public void PrintCharacter(){
//        System.out.printf("%2s%n%s%s%s%n%1s %s",head, hand, body, hand,leftFeet,rightFeet);
        System.out.print(fullBody);
    }

    public void moveDown(int numSpace){
        for (int i = 0; i < numSpace; i++){
            System.out.println();
            PrintCharacter();
            System.out.print('\u000C');
            waitSomeTime(500);
        }
    }

    public void moveRight(int numSpace){
        for (int i = 0; i < numSpace; i++){
            PrintCharacter();
            System.out.print(" ");
            //System.out.print('\u000C');
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