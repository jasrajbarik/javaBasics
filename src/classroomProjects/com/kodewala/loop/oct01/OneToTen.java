package classroomProjects.com.kodewala.loop.oct01;

public class OneToTen
{
    void display()
    {
        int i=1;
        do {
            System.out.print(i+" ");
            i++;
        } while(i<=10);
    }

    public static void main(String[] args) {
        OneToTen numbers = new OneToTen();
        numbers.display();
    }
}
