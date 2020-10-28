package exercise;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาเลือกเพศ(M/F): ");
        String gender = scanner.nextLine();
        System.out.print("อายุ : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("น้ำหนัก : ");
        double w = Integer.parseInt(scanner.nextLine());
        System.out.print("ส่วนสูง : ");
        double h = Integer.parseInt(scanner.nextLine());
        double bmr = 0;
        if (gender == "M") {
            bmr = (10 * w) + (6.25 * h) - (5 * age) + 5;
        } else {
            bmr = (10 * w) + (6.25 * h) - (5 * age) - 161;
        }

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
