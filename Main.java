public class Main {
    public static void main(String[] args) {
        // getting reportCreator unique instance
        ReportCreator reportManager = ReportCreator.getInstance();

        // generating different reports
        reportManager.generateReport("pdf");
        reportManager.generateReport("excel");
        reportManager.generateReport("word");

        // sending notifications using different adapters
        NotificationAdapter emailNotification = new EmailNotificationAdapter();
        NotificationAdapter whatsappNotification = new WhatsAppNotificationAdapter();
        NotificationAdapter telegramNotification = new TelegramNotificationAdapter();

    }
}