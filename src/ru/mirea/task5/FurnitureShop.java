package ru.mirea.task5;

public class FurnitureShop {
        private String type;
        private String color;
        private String material;
        public FurnitureShop (String type, String color, String material)
        {
            this.type = type;
            this.color = color;
            this.material = material;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getType() {
            return type;
        }

        public String getColor() {
            return color;
        }

        public String getMaterial() {
            return material;
        }
        public String toString ()
        {
            return type + " ,color " + color + " , material " + material;
        }

        public FurnitureShop()
        {
            type = "desk";
            color = "Brown";
            material = "wood";
        }

}
