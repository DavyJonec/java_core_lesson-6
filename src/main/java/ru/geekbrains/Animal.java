package ru.geekbrains;

public class Animal {
    protected String name;
    protected int swim;
    protected int run;

    public Animal(String name, int swim, int run){
        this.name = name;
        this.swim = swim;
        this.run = run;
    }

    public void swim() {
        System.out.printf("Животное %s проплыло %d \n", name, swim);
    }
    public void run() {
        System.out.printf("Животное %s пробежало %d \n", name, run);
    }
}
