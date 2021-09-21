package ru.mirea.task3;

public class Hand {
    private String finger;
    private String size;

    public Hand(String finger , String size)
    {
        this.finger = finger;
        this.size = size;
    }

    public Hand()
    {
        finger = " Brown";
        size = " small";
    }

    public void setFinger(String finger) {
        this.finger = finger;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getFinger(String finger)
    {
        return finger;
    }
    public String getSize(String size)
    {
        return size ;
    }
    public String toString(){
        return "Hand: "+ finger + " fingers, " + size + " size ";
    }
}
