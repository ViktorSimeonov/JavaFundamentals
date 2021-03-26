package _6_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _6_VehicleCatalogue {
    static class Vehicle {
        String typeOfVehicle;
        String modelOfVehicle;
        String colorOfVehicle;
        int horsePower;

        public Vehicle(String typeOfVehicle, String modelOfVehicle, String colourOfVehicle, int horsePower) {
            this.typeOfVehicle = typeOfVehicle;
            this.modelOfVehicle = modelOfVehicle;
            this.colorOfVehicle = colourOfVehicle;
            this.horsePower = horsePower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModelOfVehicle() {
            return modelOfVehicle;
        }

        public String getColourOfVehicle() {
            return colorOfVehicle;
        }

        public int getHorsePower() {
            return horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getTypeOfVehicle().toUpperCase().charAt(0) + getTypeOfVehicle().substring(1),
                    getModelOfVehicle(), getColourOfVehicle(), getHorsePower());
        }
    }

    public static double averageHorsePower(List<Vehicle> vehicles){
        if(vehicles.size()==0){
            return 0;
        }
        // понеже конските сили са в int за това го преобразуваме в double
       return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum()/vehicles.size();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {
            String model = line;

            vehicleList.stream()
                    .filter(vehicle -> vehicle.getModelOfVehicle().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));
            line = scanner.nextLine();
        }
        List<Vehicle> cars = vehicleList.stream().
                filter(vehicle -> vehicle.getTypeOfVehicle().
                        equals("car")).collect(Collectors.toList());
        List<Vehicle> trucks = vehicleList.stream().
                filter(vehicle -> vehicle.getTypeOfVehicle().equals("truck")).
                collect(Collectors.toList());
        System.out.printf("Cars have average horsepower of: %.2f.%n",averageHorsePower(cars));
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageHorsePower(trucks));
    }
}
