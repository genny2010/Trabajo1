package Problema1;

//Clase concreta Administrator que hereda de Users
class Administrator extends Users {
 @Override
 public String getType() {
     return "Administrator";
 }
}