package com.company;

class rect{
    int l,b;
    public rect(int l,int b){
        this.l = l;
        this.b = b;
    }
    void kame(int r)
    {
        System.out.println("the cute of given no. is: "+r*r*r);
    }
    void area(){
        System.out.println(l*b);
    }
    void volume(){
        System.out.println("nill");
    }
    void check(){
        System.out.println("youre thinking right bkl");
    }
}
class cub extends rect{
    int h;
    public cub(int l,int b,int h){
        super(l,b);
        this.h = h;
    }
    void area(){
        System.out.println(2*(l*b+b*h+l*h));
    }
    void volume(){
        System.out.println(l*b*h);
    }
}

public class java52 {
    public static void main(String[] args) {

//        cub c = new cub(1,2,3);
//        c.check();
//        c.area();
//        c.volume();

        rect r = new cub(1,2,3);
        r.kame(4);
        r.check();
        r.area();
        r.volume();


    }
}
