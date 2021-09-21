package ru.mirea.task5;

public class GoldenRetriever extends Dog{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public GoldenRetriever(String name,String color,int age)
    {
        super(name,color);
        this.age = age;
    }

    @Override
    public String toString() {
        return "GoldenRetriever{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
