package ru.mirea.task6;

public class car implements Priceable{
    private double price;
    private String namecall;
    public car (String namecall,double price) {
        this.namecall = "toyota";
        this.price = 1000000;
    }
    @Override
    public String getName() {
        return namecall;
    }

    @Override
    public void setName(String name) {
        namecall = name;

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "car{" +
                "price= " + price +
                ", namecall='" + namecall  + '\'' +
                '}';
    }
}
