package classroomProjects.com.kodewala.constructors.basics.constructor2;

public class NotificationDriver {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Email");
        notificationService.sendNotification("sms");

    }
}
