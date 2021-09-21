package ru.mirea.task3;

public class Leg {
    private String foot;
    private double length;

    public Leg(String foot , double length )
    {
        this.foot = foot;
        this.length = length;
    }

    public Leg()
    {
        foot = " white";
        length = 110;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public String getFoot(String foot)
    {
        return foot;
    }
    public double getLength(double length)
    {
        return length;
    }
    public String toString(){
        return "Leg: "+ foot + " foots, " + length + " lengths ";
    }
}
