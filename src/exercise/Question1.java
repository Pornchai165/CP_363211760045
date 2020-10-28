package exercise;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner me = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = me.nextDouble();

        System.out.print("Enter your height: ");
        double h = me.nextDouble();


        double height=h*0.01;
        double BMI=weight/(height*height);
        BMI=Math.floor(BMI*100)/100;
        System.out.println("BMI= "+BMI);

        if (BMI<18.5){
            System.out.println("Your status: Underweight");

        }else if (BMI<=24.9){
            System.out.println("Your status: Normal weight");

        }else if (BMI<=29.9){
            System.out.println("Your status: Overweight");

        }else if (BMI<=34.9){
            System.out.println("Your status: Obesity ");

        }else{
            System.out.println("Your status: Obese I");

        }//end if




    }//main
}//class
