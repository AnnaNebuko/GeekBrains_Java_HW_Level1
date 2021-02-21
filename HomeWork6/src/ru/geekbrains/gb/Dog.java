package ru.geekbrains.gb;

public class Dog extends Animal {
    private static int countAnimal;

    public static int getCountAnimal() {
        return countAnimal;
    }

    public Dog(int maxRunDistance, int maxSwimDistance) {
        super("Doggy", maxRunDistance, maxSwimDistance);
        countAnimal ++;
    }

    @Override
    public boolean run(int length) {
        return length <= getMaxRunDistance();
    }

    @Override
    public boolean swim(int length) {
        return length <= getMaxSwimDistance();
    }
}
