package ng.learn.FisGlobal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehilceTest {


    public static void main(String[] args) {

        VehicleService service = VehicleService.getVehicleInstance();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(service.createVehicle("Car", "Toyota", "camry", 2022, 25000.00, true));
        vehicles.add(service.createVehicle("Car", "Honda", "Civic", 2021, 23000.00, false));
        vehicles.add(service.createVehicle("Bike", "Harley-Davidson", "Sportster", 2020, 15000.00, false));
        vehicles.add(service.createVehicle("Bike", "YAMAHA", "YZF-R6", 2023, 18000.00, false));
        vehicles.add(service.createVehicle("Bike", "Ducati", "Panigale V4", 2022, 30000.00, false));


        System.out.println("\nAll Vehicles");
        vehicles.forEach(System.out::println);

        // 2. Check if a particular car model was created and present
        boolean camryPresent = vehicles.stream().anyMatch(vehicle -> vehicle instanceof Car && vehicle.getModel().equalsIgnoreCase("camry"));
        System.out.println("\nCamry Present:"+camryPresent);

        //3. Filter out all vehicles that were manufactured after 2021
        List<Vehicle> vehicleAfter2020 = vehicles.stream()
                .filter(vehicle -> vehicle.getYear() > 2020)
                .collect(Collectors.toList());

        System.out.println("\nVehicles manufactured after 2020");
        vehicleAfter2020.forEach(System.out::println);
    }
}
