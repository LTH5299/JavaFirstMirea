package ru.mirea.task19.student;

public class ValidateException extends Exception {
    public ValidateException(Exception e)  {
        super(e);
    }
}
