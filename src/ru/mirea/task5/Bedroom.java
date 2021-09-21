package ru.mirea.task5;

public class Bedroom extends FurnitureShop {
    private String type;
    private double price;
    private int n;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getN() {
        return n;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Bedroom(String type,String color, String material,double price,int n) {
        super(color, material);
        this.type=type;
        this.price=price;
        this.n=n;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", n=" + n +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
