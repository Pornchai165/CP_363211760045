package exercise;

public class SuperCar {
    private String CarBrand;
    private String CarColor;
    private int CarEngineSize;
    private int MaxSpeed;
    private String CountryOfOrigin;

    public SuperCar(){}

    public  SuperCar(String CB,String CC,int CES,int MS,String COO) {
        CarBrand = CB;
        CarColor = CC;
        CarEngineSize = CES;
        MaxSpeed = MS;
        CountryOfOrigin = COO;
    }


    public String getCarBrand() {
        return CarBrand;
    }
    public void setCarBrand(String CB) {
        CarBrand = CB;
    }


    public String getCarColor() {
        return CarColor;
    }
    public void setCarColor(String CC) {
        CarColor = CC;
    }


    public int getCarEngineSize () {
        return CarEngineSize;
    }
    public void setCarEngineSize(int CES) {
        CarEngineSize = CES;
    }


    public int getMaxSpeed () {
        return MaxSpeed;
    }
    public void setMaxSpeed(int MS) {
        MaxSpeed = MS;
    }


    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }
    public void setCountryOfOrigin(String COO) {
        CountryOfOrigin = COO;
    }


    @Override
    public String toString() {
        return "SuperCar{" +
                "CarBrand='" + CarBrand + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarEngineSize=" + CarEngineSize +
                ", MaxSpeed=" + MaxSpeed +
                ", CountryOfOrigin='" + CountryOfOrigin + '\'' +
                '}';
    }
}

