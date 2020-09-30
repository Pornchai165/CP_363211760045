package Lab7;

public class StudentApp {
    public static void main(String[] args) {

        //create object of Student class
        Student std1 = new Student();

        std1.setName("Pornchai Malasan");
        std1.setID("111111");
        std1.setAge(22);

        displayDataObject(std1);

        Student std2 = new Student();
        std2.setName("Kirito");
        std2.setID("222222");
        std2.setAge(23);

        displayDataObject(std2);

        std2.setName("Kirito");

        Student std3 = new Student ("Kirito1","333333",23);

        displayDataObject(std3);


    }//main

    private static void displayDataObject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getID());
        System.out.println(std.getAge());
    }
}//class
