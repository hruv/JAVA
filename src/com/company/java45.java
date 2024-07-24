package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        System.out.println("I am in derived and getting y now");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class cry extends Derived{
    public void letssee(){
        System.out.println("tryyyy");
    }
}

public class java45 {
    public static void main(String[] args) {
//         Creating an Object of base class
//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX())


//        Creating an object of derived class
//        Derived d = new Derived();
//        d.setY(43);
//        System.out.println(d.getY());
//        d.setX(45);
//        System.out.println(d.getX());


      //  Creating an object of try class
        cry t = new cry();
        t.letssee();
        t.setX(45);
        System.out.println(t.getX());
    }
}
