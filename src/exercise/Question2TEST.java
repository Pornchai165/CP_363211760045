package exercise;

import java.util.Scanner;

public class Question2TEST {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select=0;
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


    }

    private static void findCircleArea() {
        System.out.println("หญิง.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("อายุ : ");
        double a = scanner.nextDouble();
        System.out.print("น้ำหนัก : ");
        double k = scanner.nextDouble();
        System.out.print("ส่วนสูง : ");
        double c = scanner.nextDouble();

        double BMR = (10*k)+(6.25*c)-(5*a)-161;
        System.out.println("BMR =  " + BMR);

    }

    private static void findTriangleArea() {
        System.out.println("ชาย.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("อายุ : ");
        double a = scanner.nextDouble();
        System.out.print("น้ำหนัก : ");
        double k = scanner.nextDouble();
        System.out.print("ส่วนสูง : ");
        double c = scanner.nextDouble();
        double bmr = (10*k)+(6.25*c)-(5*a)+5;
        System.out.println("BMR =  " + bmr);



        System.out.println("How about your activity?");
        System.out.println("1.No exercise");
        System.out.println("2.1-3 day per week");
        System.out.println("3.3-5 day per week");
        System.out.println("4.6-7 day per week");
        System.out.println("5.heavy exercise or sportsman");
        System.out.print("เลือก : ");
        int seclect = Integer.parseInt(scanner.nextLine());
        double TDEE = 0;
        if (seclect == 1) {
            TDEE = bmr * 1.2;
        } else if (seclect == 2) {
            TDEE = bmr * 1.375;
        }else if (seclect == 3) {
            TDEE = bmr * 1.55;
        }else if (seclect == 4) {
            TDEE = bmr * 1.725;
        }else if (seclect == 5) {
            TDEE = bmr * 1.9;
        }
        System.out.println("TDEE is : "+TDEE);



    }
}
