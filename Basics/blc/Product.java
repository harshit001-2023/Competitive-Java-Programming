package Basics.blc;

public class Product {
    int productId;
    String productName;
    double productPrice;


    public void setProductData(int id, String name, double price){
        productId = id;
        productName = name;
        productPrice = price;
    }

    public void getProductInfo(){
        IO.println("Product ID : "+productId);
        IO.println("Product name : "+productName);
        IO.println("Product Price : "+productPrice);
    }
}
