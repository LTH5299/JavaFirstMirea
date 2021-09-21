package ru.mirea.task5;

public class Seafood extends Dish{
    private String quality;

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Seafood(String quality,String color, String material )
    {
        super(color, material);
        this.quality=quality;
    }

    @Override
    public String toString() {
        return "Seafood{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", quality='" + quality + '\'' +
                '}';
    }
}
