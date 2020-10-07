package Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_Exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer number :  ");
            int num = sc.nextInt();
            System.out.println("The number is " + num);
        }catch (Exception ex){
            ex.printStackTrace();
        }



        System.out.println("Good Bye.");






    }//main
}//class
