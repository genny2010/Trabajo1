package Problema3;

//Implementación concreta de VehicleBuilder para construir coches
class CarBuilder implements VehicleBuilder {
 private Vehicle car = new Vehicle("Car", "", "");

 @Override
 public void buildModel(String model) {
     car.setModel(model);
 }

 @Override
 public void buildColor(String color) {
     car.setColor(color);
 }

 @Override
 public void buildEngine(String engine) {
     car.setEngine(engine);
 }

 @Override
 public Vehicle build() {
     return car;
 }
}
