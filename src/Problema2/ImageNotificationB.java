package Problema2;

//Implementación de la fábrica de notificaciones de imagen.
public class ImageNotificationB implements NotificationFactory {
 @Override
 public Notification createNotification() {
     return new ImageNotificationB1();
 }
}
