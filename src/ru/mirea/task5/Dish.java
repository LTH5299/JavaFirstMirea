package ru.mirea.task5;

public class Dish {
    private String name;
    private String color;
    private String material;
    public Dish (String name, String color, String material)
    {
        this.name = name;
        this.color = color;
        this.material = material;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
    public String toString ()
    {
        return name + " ,color " + color + " , material " + material;
    }

    public Dish()
    {
        name = "Steak";
        color = "Brown";
        material = "Beef";
    }
}
