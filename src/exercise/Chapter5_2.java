package exercise;

import java.util.Scanner;

//1. รับค่า รัศมีวงกลม (r)
//2. หาพื้นที่วงกลม (PI * r * r)
//3. หาเส้นรอบวง (2 * PI * r)
//4. หาปริมาตรทรงกลม (4/3 * PI *r*r*r)
public class Chapter5_2 {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // รับค่า รัศมีวงกลม
        System.out.print("รัศมีวงกลม (r) : ");
        double r = Scanner.nextDouble();

        //
        double area = PI * r * r ;
        System.out.println("พื้นที่วงกลม : " + area);

        double Cycle = 2 * PI * r;
        System.out.println("หาเส้นรอบวง : " + Cycle);

        double volume = (4 / 3) * PI * r * r * r;
        System.out.println("หาปริมาตรทรงกลม : " + volume);



    }//main Cycle volume

}
