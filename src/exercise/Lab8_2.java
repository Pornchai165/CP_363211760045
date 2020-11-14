package exercise;

import java.util.Scanner;

public class Lab8_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        int x = 0;
        try {
             x = Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println(" can not transfer string to int.");
        }


        System.out.println(x);


    }//main
}//class
