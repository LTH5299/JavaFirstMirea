package ru.mirea.task5;

import ru.mirea.task2.task2.Ball;

import java.util.Arrays;

public class TestFurnitureShop {
    public static void main(String[] args) {
        testBedroom();
        testKitchen();
        testLivingroom();
    }
    public static void testBedroom(){
        Bedroom d1 = new Bedroom("lamp", "Yellow","ceramic",30,2);
        Bedroom d2 = new Bedroom("bed", "Brown","wood",150,1);
        Bedroom d3 = new Bedroom("tv", "Black","metal",100,1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
    public static void testKitchen(){
        Kitchen d1 = new Kitchen("dining table", "White","wood",140,1);
        Kitchen d2 = new Kitchen("stove", "Blue","ceramic",200,1);
        System.out.println(d1);
        System.out.println(d2);
    }
    public static void testLivingroom(){
        Livingroom d = new Livingroom("sofa","Blue White","leatherette",300,3);
        System.out.println(d);
    }
}
