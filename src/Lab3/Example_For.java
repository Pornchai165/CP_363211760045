package Lab3;

public class Example_For {
    public static void main(String[] args) {

        //พิมพ์ข้อมความ "Hello" 10 ครั้ง
        for (int i = 0; i <10; i++) {
            System.out.println("Hello");
        }

//
//        //วิธีแรก
//        for (int i = 1; i <=10; i++) {
//            System.out.println(""+i);
//        }

        for (int i = 1; i <=10; i++) {
            System.out.print(i+" ");
        }


       //พิมพ์เลขคู่ ที่อยู่ระหว่าง 1-20 โโยใช้คำสั่ง for (วิธีแรก)
//        for (int i = 2; i <=20; i+=2) {
//            System.out.println(""+i);
//        }

        //พิมพ์เลขคู่ ที่อยู่ระหว่าง 1-20 โโยใช้คำสั่ง for
        for (int i = 1; i <=20; i++) {
            if (i % 2 == 0)
            System.out.print(i);
        }



        //พิมพ์เลขที่หารด้วย 3 5 และ 7 ลงตัว ที่อยู่ระหว่าง 1-100
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0  )
                System.out.print(i+" ");
        }





    }
}
