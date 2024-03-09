package Problema1;

//Implementación concreta de UsersFactory para Leader
class LeaderFactory implements UsersFactory {
 @Override
 public Users createUser() {
     return new Leader();
 }
}