package exercise;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar SC1 = new SuperCar();

        SC1.setCarBrand("Honda");
        SC1.setCarColor("Red");
        SC1.setCarEngineSize(450);
        SC1.setMaxSpeed(150);
        SC1.setCountryOfOrigin("GO");

        displayDataObject(SC1);


        SuperCar SC2 = new SuperCar();
        SC2.setCarBrand("Toyota");
        SC2.setCarColor("Blue");
        SC2.setCarEngineSize(400);
        SC2.setMaxSpeed(200);
        SC2.setCountryOfOrigin("JP");

        displayDataObject(SC2);


        SuperCar SC3 = new SuperCar("Mazda","Brown",500,200,"KP");

        displayDataObject(SC3);


        SuperCar SC4 = new SuperCar("Nissan","Green",450,250,"USA");

        displayDataObject(SC4);



        SuperCar SC5 = new SuperCar("BMW","Whit",400,240,"USA");

        displayDataObject(SC5);






    }//main


    private static void displayDataObject(SuperCar sc) {
        System.out.println(sc.getCarBrand());
        System.out.println(sc.getCarColor());
        System.out.println(sc.getCarEngineSize());
        System.out.println(sc.getMaxSpeed());
        System.out.println(sc.getCountryOfOrigin());
    }





}//class
