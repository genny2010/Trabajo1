package Problema1;

//Implementación concreta de UsersFactory para Administrator
class AdministratorFactory implements UsersFactory {
 @Override
 public Users createUser() {
     return new Administrator();
 }
}