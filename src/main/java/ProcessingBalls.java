import processing.core.PApplet;

public class ProcessingBalls extends PApplet {

    public static final int WIDTH = 1500;
    public static final int HEIGHT = 500;
    int horizontalPositionBall1 = 50;
    int horizontalPositionBall2 = 50;
    int horizontalPositionBall3 = 50;
    int horizontalPositionBall4 = 50;
    int verticalPositionBall = 100;
    public static final int ballDiameter = 20;

    public static void main(String[] args) {
        PApplet.main("ProcessingBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(horizontalPositionBall1,verticalPositionBall,ballDiameter,ballDiameter);
        ellipse(horizontalPositionBall2,verticalPositionBall*2,ballDiameter,ballDiameter);
        ellipse(horizontalPositionBall3,verticalPositionBall*3,ballDiameter,ballDiameter);
        ellipse(horizontalPositionBall4,verticalPositionBall*4,ballDiameter,ballDiameter);

        horizontalPositionBall1++;
        horizontalPositionBall2+=2;
        horizontalPositionBall3+=3;
        horizontalPositionBall4+=4;

    }
}
