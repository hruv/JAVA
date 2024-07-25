package com.company;

class A{
    public void harry(){
        System.out.println("kaju");
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public  void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class java48 {
    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();

        B b = new B();
        b.harry();
        b.meth2();
    }
}
