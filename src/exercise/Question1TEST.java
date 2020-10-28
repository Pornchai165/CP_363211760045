package exercise;
//BMI = kg หาร cm ยกกำลัง2

import java.util.Scanner;

public class Question1TEST {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;
        boolean b = false;
        do {
            System.out.println("Please select the gender below.");
            System.out.println("1.ชาย");
            System.out.println("2.หญิง");
            System.out.println("3.ออกจากโปรแกรม");
            System.out.print("เลือกตัวเลขหัวข้อ : ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    findTriangleArea();
                    break;
                case 2:
                    findCircleArea();
                    break;

                case 3:
                    System.out.println("Good Bye.");
                    System.exit(1);
                    break;
                default:
                    b = true;

            }//switch
        } while (b);

    }//main

    private static void findCircleArea() {
        System.out.println("หญิง.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("น้ำหนัก : ");
        double k = scanner.nextDouble();
        System.out.print("ส่วนสูง : ");
        double c = scanner.nextDouble();
        double area = k;
        double w = c * c;

        System.out.println("BMI =  " + area/w);

        System.out.println("Underweight = <18.5.");
        System.out.println("Normal weight = 18.5–24.9.");
        System.out.println("Overweight = 25–29.9.");
        System.out.println("Obesity = BMI of 30 or greater.");




    }




    private static void findTriangleArea() {
        System.out.println("ชาย.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("น้ำหนัก : ");
        double b = scanner.nextDouble();
        System.out.print("ส่วนสูง : ");
        double n = scanner.nextDouble();
        double area =  (b/100) / n * n ;
        System.out.println("BMI =  " + area);

        System.out.println("Underweight = <18.5.");
        System.out.println("Normal weight = 18.5–24.9.");
        System.out.println("Overweight = 25–29.9.");
        System.out.println("Obesity = BMI of 30 or greater.");

    }


}//class
