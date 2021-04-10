package ru.geekbrains;

public class Cat extends Animal{

    public Cat(String name, int swim, int run) {
        super(name, swim, run);
    }

    @Override
    public void swim() {
        System.out.printf("Кошка %s не умеет плавать\n", name, swim);
    }

    @Override
    public void run() {
        if (run > 200) {
            System.out.printf("Кошка %s не побежит %d метров\n", name, run);
        } else {
            System.out.printf("Кошка %s пробежала %d метров\n", name, run);
        }
    }
}
