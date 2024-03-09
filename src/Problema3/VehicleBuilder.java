package Problema3;

//Interface Builder para la construcción de vehículos
interface VehicleBuilder {
 void buildModel(String model);
 void buildColor(String color);
 void buildEngine(String engine);
 Vehicle build();
}