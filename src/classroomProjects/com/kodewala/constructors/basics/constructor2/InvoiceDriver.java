package classroomProjects.com.kodewala.constructors.basics.constructor2;

class Invoice extends Object {
    static int gst = 18;
    int amount;
    String itemName;
    String billingAddress;
    String customerId;
    String customerName;

    Invoice( int _amount, String _itemName, String _billingAddress, String _customerId,String _customerName) {
        this.amount = _amount;
        this.itemName = _itemName;
        this.billingAddress = _billingAddress;
        this.customerId = _customerId;
        this.customerName = _customerName;
    }
}

public class InvoiceDriver {
    public static void main(String[] args) {
        int gstRevise = Invoice.gst+2;
        Invoice inv = new Invoice(150000, "Samsung s26 Ultra","BTM Stage 1","HB574","Jasraj Barik");
        Invoice inv1 = new Invoice(60000,"Vivo V60 ","Kormagala","HB700","Anmol Agarwal");
    System.out.println("First Invoice: "+inv.amount+", "+inv.customerId+", Old GST: "+inv.gst+" , New GST: "+gstRevise);
    System.out.println("Second Invoice: "+ inv1.amount+", "+inv1.customerId);
    }
}
