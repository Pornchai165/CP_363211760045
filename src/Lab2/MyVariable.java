package Lab2;

public class MyVariable {
    public static void main(String[] args) {

        //integer
        int x; // ประกาศตัวแปร x สำหรับเก็ยข้อมูลจำนวนเต็ม
        x = 10;
        System.out.println(x);
        int y = 28;
        int z = x+y;
        System.out.println(x + y); //output ?
        System.out.println(z);

        //real number (จำนวนจริง)
        // flout
        float a = 10.10f;
        double b = 10;
        System.out.println(a);
        System.out.println(b);

        //character
        char c = '#';
        System.out.println(c);

        //boolean
        boolean w = true;
        boolean r = false;
        System.out.println(w);
        System.out.println(r);

        //String ตัวแปรชนิด String จะเป็น Class ในภาษา Java
        String msg = "Hello World";
        int len = msg.length();

        System.out.println(len);
        System.out.println(msg.length());

        String u = "RUTS";
        String con = msg + u;
        System.out.println(con);
        System.out.println(msg.concat(u)); // concat เป็นเมธอดสำหรับการต่อข้อความ


    } //main
}