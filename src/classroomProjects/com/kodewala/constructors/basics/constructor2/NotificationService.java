package classroomProjects.com.kodewala.constructors.basics.constructor2;

public class NotificationService {
    public void sendNotification(String _type) {
        System.out.println(" Inside sendNotification() ");
        if (_type.equalsIgnoreCase("sms")) {
            sendSMS();
        } else if (_type.equalsIgnoreCase("email")) {
            sendEmail();
        } else {
            sendWhatsApp();
        }
    }
    private void sendSMS()
    {
    System.out.println("sendSMS() starts");
    }
    private void sendEmail()
    {
        System.out.println("sendEmail() starts");
    }
    private void sendWhatsApp()
    {
        System.out.println("sendWhatsApp() starts");
    }
}

