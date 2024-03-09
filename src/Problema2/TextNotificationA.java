package Problema2;

//Implementación de la fábrica de notificaciones de texto.
public class TextNotificationA implements NotificationFactory {
 @Override
 public Notification createNotification() {
     return new TextNotificationA1();
 }
}