package classroomProjects.com.kodewala.constructors.basics.constructor1;

public class Product {
    String productName;
    int price;
    String description;
    int quantity;

    Product(String _productName, int _price, String _description,int _quantity)
    {
        this.productName = _productName;
        this.price = _price;
        this.description = _description;
        this.quantity = _quantity;
        System.out.println("Product Name: "+productName+ "\nPrice: "+price+ "\nDescription: "+description+"\nQuantity: "+quantity);
    }

    Product(String _productName, String _description)
    {
        this.productName = _productName;
        this.description = _description;
        System.out.println("Product Name: "+productName+ "\nDescription: "+description);
    }

    Product()
    {
        System.out.println("No Data Available ");
    }
}
