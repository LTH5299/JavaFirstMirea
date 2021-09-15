package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        final Author b1 = new Author("Anna", "Anna @yandex.ru",'F');
        final Author b2 = new Author("Alex", "Alex @gmail.com",'M');
        final Author b3 = new Author("En", "En123 @yandex.ru",'U');
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
