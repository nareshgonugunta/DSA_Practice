package ng.learn.FisGlobal;

public class Car extends Vehicle{

    private boolean sunroofAvailable;

    public Car(String make, String model, int year, double price, boolean sunroofAvailable) {
        super(make, model, year, price);
        this.sunroofAvailable = sunroofAvailable;
    }

    public boolean isSunroofAvailable() {
        return sunroofAvailable;
    }


}
