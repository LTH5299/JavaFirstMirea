package ru.mirea.task4;

public class Ball {
    private double x;

    {
        x = 0.0;
    }

    private double y;

    {
        y = 0.0;
    }

    public Ball(){
        x = 3.5;
        y = 4.5;
    }
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXYSpeed(double speed) {
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
        setXYSpeed((x+y)/2);
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
