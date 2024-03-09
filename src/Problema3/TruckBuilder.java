package Problema3;

//Implementación concreta de VehicleBuilder para construir camiones
class TruckBuilder implements VehicleBuilder {
 private Vehicle truck = new Vehicle("Truck", "", "");

 @Override
 public void buildModel(String model) {
     truck.setModel(model);
 }

 @Override
 public void buildColor(String color) {
     truck.setColor(color);
 }

 @Override
 public void buildEngine(String engine) {
     truck.setEngine(engine);
 }

 @Override
 public Vehicle build() {
     return truck;
 }
}
