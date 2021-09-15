package ru.mirea.task2.task2;

public class Ball {
        private String color;
        private int price;
        public Ball(String color, int price){
            this.color = color;
            this.price = price;
        }

        public Ball()
        {
            color = "red";
            price = 50;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public String getColor(String color){
            return color;
        }
        public int getPrice() {
            return price;
        }
        public String toString(){
            return this.color+ " ,price" + this.price ;
        }
        public void intoBall(){
            System.out.println(color+ " has a price " + price+ "$");
        }
}
