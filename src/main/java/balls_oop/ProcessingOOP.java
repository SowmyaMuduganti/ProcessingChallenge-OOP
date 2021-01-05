package balls_oop;

import processing.core.PApplet;

public class ProcessingOOP extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int NUMBER_OF_BALLS = 4;

    private Ball[] balls = new Ball[NUMBER_OF_BALLS+1];

    public static void main(String[] args) {
        PApplet.main("balls_oop.ProcessingOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        for (int i = 1; i <= NUMBER_OF_BALLS; i++) {
            balls[i] = new Ball(i * HEIGHT / (NUMBER_OF_BALLS+1), i,this);
        }
    }

    @Override
    public void draw() {
        for (int i = 1; i <= NUMBER_OF_BALLS; i++) {
            balls[i].display();
        }
    }
}
