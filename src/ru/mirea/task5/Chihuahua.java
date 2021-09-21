package ru.mirea.task5;

public class Chihuahua extends Dog {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Chihuahua(String name,String color,int age)
    {
        super(name,color);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chihuahua{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
