package ru.geekbrains.gb;


public class Cat extends Animal{
    private int maxRunDistance;
    private static int countAnimal;

    public static int getCountAnimal() {
        return countAnimal;
    }

    public Cat(int maxRunDistance) {
        super("Kitty", maxRunDistance, 0);
        maxRunDistance = 200;
        countAnimal++;
    }

    @Override
    public boolean run(int length) {
        return length <=maxRunDistance;

    }

    @Override
    public boolean swim(int length) {
        System.out.println("Cats cannot swim ...");
        return false;
    }
}
