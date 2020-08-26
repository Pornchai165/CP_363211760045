package Lab4;

public class Example_OverloadMethod {
    public static int findMax(int x,int y) {
        return (x > y) ? x : y;
        //if(x>y)
        //      return x;
        //else
        //      return y;
    }
    public static  double findMax(double x , double y) {
        return (x > y) ? x : y;
    }

    public static void main(String[] args) {
        int max = findMax(5, 10);
        System.out.println("Maximum is "+max);
        double max2 = findMax(5.0, 10.0);
        System.out.println("Maximum(2) is "+max2);
    }//main
}
