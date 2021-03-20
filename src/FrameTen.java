import java.util.Scanner;

public class FrameTen {
    Scanner BallScore = new Scanner(System.in);
    private static int ballOne = 0;
    private static int ballTwo = 0;
    private static int ballThree = 0;
    private boolean scoreCatch = false;

    //constructor
    FrameTen(){

    }

    //getters
    public static int getScore(){
        return ballOne + ballTwo + ballThree;
    }
    public static int getBallOne(){
        return ballOne;
    }
    public static int getBallTwo(){
        return ballTwo;
    }
    public static int getBallThree(){
        return ballThree;
    }

    //setters
    public void setBallOne(){
        //reads in user value for ball one
        System.out.println("Enter the score of Ball one");
        ballOne = BallScore.nextInt();
        //error checking, no score higher than 10
        if(ballOne > 10 || ballOne < 0)
        {
            scoreCatch = true;
        }
        while(scoreCatch)
        {
            if(ballOne > 10) {
                System.out.println("Invalid score, please enter a number less than or equal to 10");
                ballOne = BallScore.nextInt();
                //while loop exit condition
                if (ballOne <= 10 || ballOne >= 0)
                    scoreCatch = false;
            }
        }
    }

    public void setBallTwo() {
        //frame ten is special, you can bowl a strike and "push back" the frame. this if statement "starts the frame" if you bowl a strike with ball one
        if (getBallOne() == 10) {
            System.out.println("Enter the score of ball two");
            ballTwo = BallScore.nextInt();
            //error checking, no ball higher than 10
            if (ballTwo > 10) {
                scoreCatch = true;
            }
            while (scoreCatch) {
                if (getBallOne() + ballTwo > 10) {
                    System.out.println("Invalid Score, please enter a ball score such that ball one + ball two <= 10");
                    ballTwo = BallScore.nextInt();
                    //while loop exit condition
                    if (getBallOne() + ballTwo <= 10 || getBallOne() + ballTwo >= 0 ) {
                        scoreCatch = false;
                    }
                }
            }
        }
        //else condition for if you didn't bowl a strike with frame one, this else condition runs the frame like a "standard frame"
        else {
            System.out.println("Enter the score of ball two");
            ballTwo = BallScore.nextInt();
            if (getBallOne() + ballTwo > 10 || getBallOne() + ballTwo <= 0) {
                scoreCatch = true;
            }
            while (scoreCatch) {
                if (getBallOne() + ballTwo > 10 || getBallOne() + ballTwo < 0) {
                    System.out.println("Invalid Score, please enter a ball score such that ball one + ball two <= 10");
                    ballTwo = BallScore.nextInt();
                    if (getBallOne() + ballTwo <= 10) {
                        scoreCatch = false;
                    }
                }
            }
        }
        return;
    }


    public void setBallThree(){
        //if statement checks the condition that you knocked down 10 pins by the end of ball 2
        if(getBallOne() == 10 || getBallOne() + getBallTwo() == 10 )
        {
            System.out.println("Enter the score of ball three");
            //error checking, you cannot have a ball higher than 10
            if(ballThree > 10 || ballThree < 0)
            {
                scoreCatch = true;
            }
            while(scoreCatch)
            {
                //error checking
                if(ballThree > 10) {
                    System.out.println("Invalid score, please enter a number less than or equal to 10");
                    ballThree = BallScore.nextInt();
                    //while loop exit condition
                    if (ballThree <= 10 || ballThree >= 0)
                        scoreCatch = false;
                }
            }
            ballThree = BallScore.nextInt();
            return;
        }
        else
            return;
    }


    void setScore(){
        setBallOne();
        setBallTwo();
        setBallThree();
        return;
    }
}
