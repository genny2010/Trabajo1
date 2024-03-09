package Problema1;

//Implementación concreta de UserFactory para Collaborator
class CollaboratorFactory implements UsersFactory {
 @Override
 public Users createUser() {
     return new Collaborator();
 }
}
