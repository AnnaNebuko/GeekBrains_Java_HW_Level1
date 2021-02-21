package ru.geekbrains.gb;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 100, false);
        Plate plate = new Plate(100, cat.getAppetite());
        plate.info();
        cat.eat(plate);
        plate.info();
        Cat [] cats = {
                new Cat("Murchik", 30, false),
                new Cat("Sima", 50, false),
                new Cat("Zayac", 20, false)
        };
        int appetiteOfCats = 0;
        for (Cat value : cats) {
            appetiteOfCats += value.getAppetite();
        }
        Plate plate2 = new Plate(100, appetiteOfCats);
        for (Cat value : cats) {
            value.eat(plate2);
        }
    }

}
