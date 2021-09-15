package ru.mirea.task5;

public class Dog {
    private String name;
    private String color;
    private String type;
    private int year;
    public Dog (String name, String color, String type, int year)
    {
        this.name = name;
        this.color = color;
        this.type = type;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public String toString ()
    {
        return name + " ,color " + color + " , type " + type + " ,years " + year;
    }

    public Dog()
    {
        name = "Bob";
        color = "Brown";
        type = "Berger";
        year = 3;
    }
}
