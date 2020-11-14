package Lab3;

import java.util.Scanner;

public class Example_If_else {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter integer 1 : ");
        int x = Scanner.nextInt();
        System.out.print("Enter integer 2 : ");
        int y = Scanner.nextInt();


        //test condition

        if (x > y) {
            System.out.println(x + " more than " + y);
        } else {
            System.out.println(x + " less than " + y);
        }


    }//main
}//class
