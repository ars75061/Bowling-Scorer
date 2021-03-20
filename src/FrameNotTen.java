import java.util.Scanner;
public class FrameNotTen {

    //intialize variables
    private static int ballOne = 0;
    private static int ballTwo = 0;
    Scanner BallScore = new Scanner(System.in);
    private boolean scoreCatch = false;

    //constructor
    FrameNotTen(){

    }

    //getters
    public static int getScore(){ return ballOne + ballTwo; }
    public static int getBallOne(){ return ballOne; }
    public static int getBallTwo(){ return ballTwo; }

    //setters
    public void setBallOne(){
        //take in user value for ball one
        System.out.println("Enter the score of Ball one");
        ballOne = BallScore.nextInt();
        //error checking, no ball greater than 10
        if(ballOne > 10 || ballOne < 0)
        {
            scoreCatch = true;
        }
        while(scoreCatch)
        {
            if(ballOne > 10) {
                //take in user value for ball one until user enters valid value
                System.out.println("Invalid score, please enter a number less than or equal to 10");
                ballOne = BallScore.nextInt();
                //while loop exit condition
                if (ballOne <= 10 || ballOne >= 0)
                    scoreCatch = false;
            }
        }
    }

    public void setBallTwo(){
        //you dont get a ball two if you knock down all 10 pins with ball one, this if statement checks that
        if(getBallOne() == 10)
            return;
        else{
            //take in user value for ball two
            System.out.println("Enter the score of ball two");
            ballTwo = BallScore.nextInt();
            //error checking, no score greater than ten for two combined balls
            if(getBallOne() + ballTwo > 10)
                scoreCatch = true;
        }
        while(scoreCatch) {
            //take in user value for ball two until valid score is provided
            if (getBallOne() + ballTwo > 10 || getBallOne() + ballTwo < 0) {
                System.out.println("Invalid Score, please enter a ball score such that ball one + ball two <= 10");
                ballTwo = BallScore.nextInt();
                //while loop exit condition
                if(getBallOne() + ballTwo <= 10 || getBallOne() + ballTwo <= 0)
                    scoreCatch = false;
            }

        }
        return;
    }

    void setScore(){
        setBallOne();
        setBallTwo();
        return;
    }

}
