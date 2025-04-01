package ng.learn.FisGlobal;

import java.io.Serializable;


public class VehicleService implements Serializable {

    private static VehicleService vehicleInstance;

    private VehicleService(){
        if(vehicleInstance != null){
            throw new IllegalArgumentException("Object is already available");
        }
    }
    public static VehicleService getVehicleInstance(){
        if(vehicleInstance == null){
            vehicleInstance =  new VehicleService();
        }
        return vehicleInstance;
    }

    public Vehicle createVehicle(String type, String make, String model, int year, double price, boolean sunroofAvailable){
        if("Car".equalsIgnoreCase(type)){
            return new Car(make, model, year, price, sunroofAvailable);
        } else if("Bike".equalsIgnoreCase(type)){
            return new Bike(make, model, year, price);
        } else {
            throw new IllegalArgumentException("Invalid vehicl type"+type);
        }

    }

    // Ensure singleton in case of serialization and cloning
    private Object readResolve(){
        return vehicleInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return vehicleInstance;
    }
}
