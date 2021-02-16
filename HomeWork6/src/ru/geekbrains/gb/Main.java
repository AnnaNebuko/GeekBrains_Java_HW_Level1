package ru.geekbrains.gb;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Murchik");
        dog.run(150);
        cat.run(50);
        dog.swim(10);

        System.out.println("Animals: " + createAndCount(new Animal("a")));
        System.out.println ("Dogs: " + createAndCount( new Dog("d")));
        System.out.println ("Cats: " + createAndCount(new Cat("c")));
    }

    private static int createAndCount(Animal being) {
        Random rand = new Random();
        int severalAnimals = rand.nextInt(25);
        for (int i = 0; i < severalAnimals; i++) {
            if (being.name.equals("a")) being = new Animal("");
            else if (being.name.equals("d")) being = new Dog("");
            else being = new Cat("");
        }
        return being.countAnimal;
    }

}
