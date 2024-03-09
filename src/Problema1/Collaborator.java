package Problema1;

//Clase concreta Collaborator que hereda de Users
class Collaborator extends Users {
 @Override
 public String getType() {
     return "Collaborator";
 }
}