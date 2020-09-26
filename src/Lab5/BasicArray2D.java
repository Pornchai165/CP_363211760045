package Lab5;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class BasicArray2D {

    public static void main(String[] args) {

        int number[][] = new int[2][3];  // 2 * 3 = 6 blocks

        number = inputDatatoArray(number);
        showDataInArray(number);
        //find total
        findTotal(number);
        //find max
        findMax(number);
        //find min
        findMin(number);

    }//main

    private static void findMin(int[][] number) {
        int min = number[0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (min >= number[i][j]){
                    min = number[i][j];
                }
            }
        }
        System.out.println("Mimimum value in array(2D): "+min);
    }

    private static void findMax(int[][] number) {
        int max = number[0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (max <= number[i][j]){
                    max = number[i][j];
                }
            }
        }
        System.out.println("Maximum value in array(2D): "+max);

    }

    private static void findTotal(int[][] number) {
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                total += number[i][j];
            }
        }
        System.out.println("Total value in array(2D): "+total);

    }

    private static void showDataInArray(int[][] number) {
        System.out.println("Data in array: ");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static int[][] inputDatatoArray(int[][] number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integer to array(2D): ");
        for (int i = 0; i < number.length; i++) { //row
            for (int j = 0; j < number[i].length ; j++) { // column
                System.out.print("number["+i+"]["+j+"]: ");
                number[i][j] = sc.nextInt();
            }// for j
        }// for i
        return number;
    }

}//class