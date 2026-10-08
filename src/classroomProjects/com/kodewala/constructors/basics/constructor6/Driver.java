package classroomProjects.com.kodewala.constructors.basics.constructor6;

public class Driver {
    public static void main(String[] args) {
        ElectronicProduct elecPro = new ElectronicProduct("Iphone18",180000,"IPN66",2);
        System.out.println(elecPro.productName);
        System.out.println(elecPro.price);
        System.out.println(elecPro.productId);
        System.out.println(elecPro.warranty);

    }
}
