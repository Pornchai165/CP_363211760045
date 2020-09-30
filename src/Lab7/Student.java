package Lab7;

import java.util.Date;

public class Student {
    private String name;
    private String person_id;
    private int age;
    //constructor
    //default
    public Student(){}

    public Student(String n,String pid,int a){
        name = n;
        person_id = pid;
        age = a;
    }
    //getter and setter
    //get คือ อ่าสนข้อมูลจาก attributes ของ object
    //set คือ เปลื่ยนแปลงหรือปรับปรุงข้อมูล attributes ของ object


    public  String getName(){
        return name;
    }
    public void  setName(String n){
        name = n;
    }



    public  String getID(){
        return person_id;
    }
    public void  setID(String p_id){
        person_id = p_id;
    }




    public  int getAge(){
        return age;
    }
    public void  setAge(int a){
        age = a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", person_id='" + person_id + '\'' +
                ", age=" + age +
                '}';
    }
}//class

