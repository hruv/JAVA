//Create a class Game, which allows a user to play "Guess the Number" game once.
//
//Game should have the following methods:
//Constructor to generate the random number
//takeUserInput() to take a user input of number
//isCorrectNumber() to detect whether the number entered by the user is true
//getter and setter for noOfGuesses
//Use properties such as noOfGuesses(int), etc to get this task done!
package com.company;
import java.util.Scanner;
import java.util.Random;

class game {
    int r;
    int inp;
    int count;
    int f;

    public game() {
        Random in = new Random();
        r = in.nextInt(0, 101);
         System.out.println(r);
    }

    public void takeUserInput(int a) {
        inp = a;
    }

    public void check() {
        for (;inp != r;) {

            if (inp == r) {
                count = count;
            } else if (inp > r) {
                System.out.println("thinl smalller bkl:");
                count = count + 1;
            } else {
                System.out.println("thinl bigger bkl:");
                count = count + 1;
            }
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            inp = i;
        }
        f = count + 1;

    }
    public int get(){
        return f;
    }
}


public class java43 {
    public static void main(String[] args) {
        game ob = new game();
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        ob.takeUserInput(b);
        ob.check();
        System.out.println(ob.get());
//       ob.getter(0);

    }
}
