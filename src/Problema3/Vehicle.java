package Problema3;

//Clase Vehicle que representa el producto final
class Vehicle {
 private String model;
 private String color;
 private String engine;

 public Vehicle(String model, String color, String engine) {
     this.model = model;
     this.color = color;
     this.engine = engine;
 }

 // Getters y setters
 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 public String getEngine() {
     return engine;
 }

 public void setEngine(String engine) {
     this.engine = engine;
 }

 @Override
 public String toString() {
     return "Vehicle{" +
             "model='" + model + '\'' +
             ", color='" + color + '\'' +
             ", engine='" + engine + '\'' +
             '}';
 }
}
