package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Image processing Machine learning" +
                " และ Deep learning เป็นกระบวนการสำคัญที่ทำให้ปัญญาประดิษฐ์สามารถรู้จำวัตถุต่างๆ" +
                " ที่อยู่ในภาพหรือในวีดิโอได้" +
                " ในหลักสูตรนี้คุณจะได้เรียนรู้หลักการและกระบวนการทำงานด้านการประมวลผลภาพ" +
                " การเรียนรู้ของเครื่อง และการเรียนรู้เชิงลึกผ่านเครื่องมือ Python and OpenCV, NumPy," +
                " Matplotlib, Sklearn, Keras, Tensorflow" +
                " เพื่อให้เห็นแนวทางที่ใช้ในการแก้ไขปัญหาจากตัวอย่างของกรณีศึกษาจริง" +
                " โดยการนำไปประยุกต์ใช้ในงานกับข้อมูลภาพและวีดิโอ สร้างแบบจำลองการจำแนกข้อมูลในภาพ" +
                " สร้างแบบจำลองการตรวจจับวัตถุในวีดิโอ");

        StringTokenizer strToken = new StringTokenizer(str.toString());
        int countWord = strToken.countTokens();
        System.out.println("Word count: "+countWord);

        while (strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());
        }

    }

}