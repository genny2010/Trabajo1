package Problema1;

public class Main {
 public static void main(String[] args) {
     // Crea una instancia de Collaborator usando CollaboratorFactory
     UsersFactory collaboratorFactory = new CollaboratorFactory();
     Users collaborator = collaboratorFactory.createUser();
     System.out.println("User type: " + collaborator.getType());

     // Crea una instancia de Administrator usando AdministratorFactory
     UsersFactory administratorFactory = new AdministratorFactory();
     Users administrator = administratorFactory.createUser();
     System.out.println("User type: " + administrator.getType());

     // Crea una instancia de Leader usando LeaderFactory
     UsersFactory leaderFactory = new LeaderFactory();
     Users leader = leaderFactory.createUser();
     System.out.println("User type: " + leader.getType());
 }
}