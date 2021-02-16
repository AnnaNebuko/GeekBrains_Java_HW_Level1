package ru.geekbrains.gb;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > 500 || length < 0) System.out.println
                ("Sorry! Invalid number");
        else System.out.printf("%s has run %d" +
                " meters.%n", name, length);
    }

    @Override
    void swim(int length) {
        if (length > 10 || length < 0) System.out.println
                ("Sorry! Invalid number");
        else System.out.printf("%s has swum %d" +
                " meters.%n", name, length);
    }
}
