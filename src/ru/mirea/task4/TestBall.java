package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        Ball b2 = new Ball(200, 50);
        Ball b3 = new Ball(90, 150);
        Ball b4 = new Ball();
        b4.setXY(5,10);
        System.out.println("BEFORE: ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("AFTER: ");
        b1.move(30, 15);
        b2.move(40, 10);
        b3.move(20, 20);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
