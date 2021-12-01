package ru.mirea.task26;

public class Rate {
    private Student_rate rate;

    public Rate(Student_rate rate)
    {
        this.rate = rate;
    }

    public String Score(int GPA){
        return rate.Rating(GPA);
    }
}
