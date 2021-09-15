package ru.mirea.task2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Green", 2);
        Ball d2 = new Ball("Pink", 5);
        Ball d3 = new Ball("Red",9);
        System.out.println(d1);
        d1.intoBall();
        d2.intoBall();
        d3.intoBall();
    }
}
