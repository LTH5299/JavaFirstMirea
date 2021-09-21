package ru.mirea.task3;

public class Book {
        private String name;
        private String author;
        private int price;
        private double rating;
        private int year;
        public Book(String name, String author, int price, double rating, int year){
            this.name = name;
            this.author = author;
            this.price = price;
            this.rating = rating;
            this.year = year;
        }
        public Book()
        {
            name = "Work";
            author = "Jame";
            price = 50;
            rating = 4;
            year = 2000;

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
        public void setYear(int year) {
            this.year = year;
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
        public int getYear() {
            return year;
    }

    public String toString(){
            return this.name+ ", author "+this.author +  " ,price " + this.price + " ,rating " + this.rating + " ,years " + this.year;
        }
        public void intoBook(){
            System.out.println(name+"'s on top3 book of this week with " + rating + " rating on Amazon in " + year +  " years" );
        }
}
