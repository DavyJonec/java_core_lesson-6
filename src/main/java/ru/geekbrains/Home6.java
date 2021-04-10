package ru.geekbrains;

public class Home6 {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Cat("Зусик", 0, 1350),
                new Dog("Барбос", 15, 1000),
                new Dog("Вася", 9, 400),
                new Cat("Барсик", 0, 180),
                new Cat("Апик", 0, 190),
        };
        for (Animal animal : zoo) {
            animal.swim();
            animal.run();
        }
        //comment
    }
}

