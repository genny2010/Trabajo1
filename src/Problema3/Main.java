package Problema3;

public class Main {
 public static void main(String[] args) {
     // Crear un director
     VehicleDirector director = new VehicleDirector();

     // Crear un constructor de coches
     VehicleBuilder carBuilder = new CarBuilder();

     // Construir un coche personalizado
     Vehicle car = director.construct(carBuilder, "Sedan", "Blue", "V6");
     System.out.println("Car: " + car);

     // Crear un constructor de camiones
     VehicleBuilder truckBuilder = new TruckBuilder();

     // Construir un camión personalizado
     Vehicle truck = director.construct(truckBuilder, "Pickup", "Red", "V8");
     System.out.println("Truck: " + truck);
 }
}