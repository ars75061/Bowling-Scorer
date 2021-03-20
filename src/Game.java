
public class Game {

    //variable initialization
    FrameNotTen frameNotTen;
    FrameTen frameTen;

    //constructor
    public Game(){
        frameNotTen = new FrameNotTen();
        frameTen = new FrameTen();
    }

    public void run()
    {
        int Score = 0;
        boolean GameRunning = true;
        //while the game is running, count 10 frames and score them (CURRENTLY NO MODIFIER FOR STRIKES AND SPARES)
        while(GameRunning)
        {
            for(int i = 1; i <= 10; i++)
            {
                System.out.println("FRAME " + i);
                //frames one through nine get counted here
                if(i < 10) {
                    frameNotTen.setScore();
                    Score = Score + FrameNotTen.getScore();
                }
                //frame ten gets counted here
                else
                    frameTen.setScore();
                    Score = Score + FrameTen.getScore();
                    GameRunning = false;
            }
            System.out.println(Score);
        }
    }

    public static void main(String[] args)
    {
        Game g = new Game();
        g.run();
    }
}
