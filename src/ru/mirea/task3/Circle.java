package ru.mirea.task3;

public class Circle {

        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }
        public double getPerimeter() {
            return Math.PI * 2 * radius;
        }

        public String toString() {
            return "Circle with radius: " + this.radius + ", area: " + this.getArea() + ", perimeter: " + this.getPerimeter();
        }
        public void intoCircle(){
            System.out.println("Radius " + radius + " of circle area  " + getArea() + " ,perimeter " + getPerimeter() );
        }
}

