package exercise;

import java.util.Scanner;

public class Chapter4_1 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter in num1 :  ");
        int num1 = Scanner.nextInt();
        System.out.print("Enter in num2 :  ");
        int num2 = Scanner.nextInt();
        System.out.print("Enter in num3 :  ");
        int num3 = Scanner.nextInt();
        System.out.print("Enter in num4 :  ");
        int num4 = Scanner.nextInt();
        System.out.print("Enter in num5 :  ");
        int num5 = Scanner.nextInt();
        System.out.print("Enter in num6 :  ");
        int num6 = Scanner.nextInt();
        System.out.print("Enter in num7 :  ");
        int num7 = Scanner.nextInt();
        System.out.print("Enter in num8 :  ");
        int num8 = Scanner.nextInt();
        System.out.print("Enter in num9 :  ");
        int num9 = Scanner.nextInt();
        System.out.print("Enter in num10 :  ");
        int num10 = Scanner.nextInt();

        int total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        int avg = total / 10;

        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);
            }

}
