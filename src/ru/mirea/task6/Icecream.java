package ru.mirea.task6;

public class Icecream implements Priceable{
    private double price;
    private String namecall;
    public Icecream (String namecall,double price){
        this.namecall = "socola icecream";
        this.price = 2;

    }
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
        return "Icecream{" +
                "price=  " + price +
                ", namecall='" + namecall + '\'' +
                '}';
    }
}
