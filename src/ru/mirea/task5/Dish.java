package ru.mirea.task5;

public class Dish {
    protected String color;
    protected String material;
    public Dish ( String color, String material)
    {
        this.color = color;
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
