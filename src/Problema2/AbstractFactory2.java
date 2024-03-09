package Problema2;

//Clase principal con los métodos para crear y enviar notificaciones.
public class AbstractFactory2 {
	
 // Método para crear y enviar una notificación de texto
 public void sendTextNotification() {
     NotificationFactory textFactory = new TextNotificationA();
     Notification textNotification = textFactory.createNotification();
     textNotification.send();
 }
 
 // Método para crear y enviar una notificación de imagen
 public void sendImageNotification() {
     NotificationFactory imageFactory = new ImageNotificationB();
     Notification imageNotification = imageFactory.createNotification();
     imageNotification.send();
 }
 
 // Método para crear y enviar una notificación de video
 public void sendVideoNotification() {
     NotificationFactory videoFactory = new VideoNotificationC();
     Notification videoNotification = videoFactory.createNotification();
     videoNotification.send();
 }
 
 // Método principal para probar la funcionalidad
 public static void main(String[] args) {
     AbstractFactory2 factory = new AbstractFactory2();
     factory.sendTextNotification();
     factory.sendImageNotification();
     factory.sendVideoNotification();
 }
}