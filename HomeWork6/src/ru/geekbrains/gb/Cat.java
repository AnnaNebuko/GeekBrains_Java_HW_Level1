package ru.geekbrains.gb;


public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > 200 || length < 0) System.out.println
                ("Sorry! Invalid number");
        else System.out.printf("%s has run %d" +
                " meters.%n", name, length);
    }
}
