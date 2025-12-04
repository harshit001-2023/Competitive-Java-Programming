package Basics.elc;

import Basics.blc.Product;

public class TestProduct {
    static void main() {
        int productId = Integer.parseInt(IO.readln("Enter Product ID : "));
        String productName = IO.readln("Enter Name of the Product : ");
        double productPrice = Double.parseDouble(IO.readln("Enter Product Price : "));

        Product product = new Product();
        product.setProductData(productId, productName, productPrice);
        product.getProductInfo();
    }
}
