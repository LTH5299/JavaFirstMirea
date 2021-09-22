package ru.mirea.task6;
import java.lang.System;

import static ru.mirea.task6.Priceable.*;


public class TestPriceable {
    public static void main(String [] args)
    {
        testIcecream();
        testcar();

    }
    public static void testIcecream()
    {
        Priceable icecream = new Icecream("Socola ice cream",3);
        System.out.println(icecream);
    }
    public static void testcar()
    {
        car c = new car("Roll-royce",200000);
        System.out.println(c);
    }
 }

