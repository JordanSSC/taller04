public class WhatsAppNotificationAdapter implements NotificationAdapter {
    @Override
    public void send(String message) {
        System.out.println("Enviando mensaje de WhatsApp: " + message);
    }
}