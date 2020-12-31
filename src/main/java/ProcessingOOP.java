import processing.core.PApplet;

public class ProcessingOOP extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    Ball ball1,ball2,ball3,ball4;

    public static void main(String[] args) {
        PApplet.main("ProcessingOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        ball1 = new Ball(HEIGHT/5, 1, this);
        ball2 = new Ball(2*HEIGHT/5, 2, this);
        ball3 = new Ball(3*HEIGHT/5, 3, this);
        ball4 = new Ball(4*HEIGHT/5, 4, this);
    }

    @Override
    public void draw() {
        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
    }
}
