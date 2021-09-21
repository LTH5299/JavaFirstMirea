package ru.mirea.task5;

public class FurnitureShop {
        protected String color;
        protected String material;
        public FurnitureShop ( String color, String material)
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
            return "FurnitureShop{" +
                    "color='" + color + '\'' +
                    ", material='" + material + '\'' +
                    '}';
        }
}
