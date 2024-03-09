package Problema2;

//Implementación de la fábrica de notificaciones de video.
public class VideoNotificationC implements NotificationFactory {
 @Override
 public Notification createNotification() {
     return new VideoNotificationC1();
 }
}