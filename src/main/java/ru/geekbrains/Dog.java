package ru.geekbrains;

public class Dog extends Animal{

    public Dog(String name, int swim, int run) {
        super(name, swim, run);
    }
    @Override
    public void swim() {
        if (swim < 10) {
            System.out.printf("Собака %s проплыла %d метров\n", name, swim);
        } else {
            System.out.printf("Собака %s не поплывёт %d\n", name, swim);
        }
    }
    @Override
    public void run() {
        if (run < 500) {
            System.out.printf("Собака %s пробежала %d метров\n", name, run);
        } else {
            System.out.printf("Собака %s не побежит %d метров\n", name, run);
        }
    }

}
