package Problema3;

//Director para controlar el proceso de construcción de vehículos
class VehicleDirector {
 public Vehicle construct(VehicleBuilder builder, String model, String color, String engine) {
     builder.buildModel(model);
     builder.buildColor(color);
     builder.buildEngine(engine);
     return builder.build();
 }
}
