package ng.learn.FisGlobal;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    //5. Need to make sure no attribute of vehicle is serialized ever.
    private void writeObject(ObjectOutputStream stream) throws IOException {
        throw new NotSerializableException(getClass().getName());
    }
    private void readObject(ObjectInputStream stream) throws IOException{
        throw new NotSerializableException(getClass().getName());
    }

}
