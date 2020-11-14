package Lab2;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter you name ?: ");
        String name = scanner.nextLine();

        System.out.println("Your name is "+name);

        System.out.print("อายุเท่าไร ?: ");
        int age = scanner.nextInt();
        System.out.println("อายุของคุณคือ " + age);

        System.out.print("Enter you nick name ?: ");
        String nickName = scanner.nextLine();
        System.out.println("Your nick name is "+name);

    }//main


}//class
