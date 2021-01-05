package balls_oop;

import processing.core.PApplet;

public class Ball{

    private final int height;
    private final int speed;
    private final PApplet sketch;
    private int x;

    public Ball(int height, int speed, PApplet sketch)  {
        this.height = height;
        this.speed = speed;
        this.x = 0;
        this.sketch = sketch;
    }

    public void display() {
        drawBall();
        moveBall();
    }

    public void drawBall() {
        sketch.ellipse(x,height,10,10);
    }

    private void moveBall() {
        x += speed;
    }
}
