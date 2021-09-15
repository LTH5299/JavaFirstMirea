package ru.mirea.task2.task2;

public class Book {
        private String name;
        private String author;
        private int price;
        private double rating;
        public Book(String name, String author, int price, double rating){
            this.name = name;
            this.author = author;
            this.price = price;
            this.rating = rating;
        }
        public Book()
        {
            name = "Work";
            author = "Jame";
            price = 50;
            rating = 4;

        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public void setRating(double rating) {
            this.rating = rating;
        }
        public String getName(String name){
            return name;
        }
        public String getAuthor(String author){
            return author;
        }
        public int getPrice() {
            return price;
        }
        public double getRating(){
            return rating;
        }
        public String toString(){
            return this.name+ ", author "+this.author + " ,author" + " ,price " + this.price + " ,rating " + this.rating;
        }
        public void intoBook(){
            System.out.println(name+"'s on top3 book of this week with " + rating + " rating on Amazon");
        }
}
