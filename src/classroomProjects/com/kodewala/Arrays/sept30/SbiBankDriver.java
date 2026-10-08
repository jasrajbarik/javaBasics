package classroomProjects.com.kodewala.Arrays.sept30;
public class SbiBankDriver {
    public static void main(String[] args) {
        SbiBank[] account = new SbiBank[4];

        account[0] = new SbiBank("Jasraj",1500,"8677025998");
        account[1] = new SbiBank("Rahul",3500,"9898956644");
        account[2] = new SbiBank("raj", 150, "9154484589");
        account[3] = new SbiBank("Himadri",6500,"85665546565");

        for(int i =0;i<account.length;i++) {
            if(account[i].balance<2000)
            {
                System.out.println(account[i].customerName+" is having balance less than 2000 \n Balance: "+account[i].balance);
            }
        }

    }
}