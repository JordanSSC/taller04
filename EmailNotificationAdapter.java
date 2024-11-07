public class EmailNotificationAdapter implements NotificationAdapter {
    @Override
    public void send(String message) {
        System.out.println("Enviando correo electrónico: " + message);
    }
}