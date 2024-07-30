package com.company;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void speak();

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("Meow!");
    }
}

public class java53{
    public static void main(String[] args) {
        Animal d = new Dog("Buddy");
        d.speak();
        d.eat();

        Animal c = new Cat("Whiskers");
        c.speak();
        c.eat();
    }
}