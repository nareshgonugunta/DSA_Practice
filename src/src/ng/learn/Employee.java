package ng.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Employee {

    private final int id;
    private final String name;
    private final double sal;

    private final List<String> address;

    public Employee(int id, String name, double sal, List<String> address){
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.address = List.copyOf(address);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }


    public List<String> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", address=" + address +
                '}';
    }
}
