package exercise;

import java.util.Scanner;

public class Chapter4_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter real number : ");
        int a = Scanner.nextInt();
        System.out.print("Enter real number : ");
        double b = Scanner.nextDouble();
        System.out.print("Enter integer : ");
        int c = Scanner.nextInt();
        System.out.print("Enter real number : ");
        double d = Scanner.nextDouble();

        System.out.println(a + " " + b + " " + c + " " + d);

    }
}
