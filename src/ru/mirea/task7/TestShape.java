package ru.mirea.task7;
import java.lang.System;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        task3();
    }

    public static void task3() {
        Circle s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());


        Circle c1;
        c1 = s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());


        Square s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
    }

    public static void testCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of circle: ");
        Circle newCircle = new Circle(sc.nextDouble());
        sc.nextLine();
        System.out.print("Color of circle: ");
        newCircle.setColor(sc.nextLine());
        System.out.print("Circle filled (true/false): ");
        newCircle.setFilled(sc.nextBoolean());
        System.out.print(newCircle);
        sc.close();
    }

    public static void testRectangle() {
        Rectangle newRectangle = new Rectangle(5, 7, "White", false);
        System.out.println(newRectangle);
    }

    public static void testSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.print("yes: Load default, no: Create new one. Yes/no?: ");
        if (sc.nextLine().equals("yes")) {
            Square newSquare = new Square(5, "Blue", true);
            System.out.println(newSquare);
        } else {
            Square newSquare = new Square();
            System.out.print("Side of square: ");
            newSquare.setSide(sc.nextDouble());
            sc.nextLine();
            System.out.print("Color of circle: ");
            newSquare.setColor(sc.nextLine());
            System.out.print("Square filled (true/false): ");
            newSquare.setFilled(sc.nextBoolean());
            System.out.print(newSquare);
        }
        sc.close();
    }
}
