package handle;

import entity.Product;
import entity.Student;

import java.util.Scanner;

public class ProductHandle {
    public Product inputProduct(Scanner scanner, int i) {
        System.out.println("Nhập thông tin sản phẩm thứ: "+(i+1));
        System.out.println("Mời bạn nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập mô tả sản phẩm:");
        String detailed = scanner.nextLine();
        System.out.println("Mời bạn nhập số lượng sản phẩm:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập giá bán sản phẩm:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập đơn vị tính sản phẩm:");
        String calculationUnit = scanner.nextLine();
        Product product = new Product(name,detailed,number,price,calculationUnit);
        return product;
    }
    public void getProduct(Product[] products){
        for (int i = 0; i < products.length ; i++) {
            System.out.println(products[i]);
        }
    }

    public void checkNameProduct(Product[] products, String name){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equalsIgnoreCase(name)){
                System.out.println(""+products[i]);
            }
        }
    }
    public Product checkIDProduct(Product[] products,int id){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId()==id){
                return products[i];
            }
        }
        return null;
    }

    public boolean updateProductByID(Product product, int number){
        if (product==null) return false;
            else {
            product.setNumber(number);
            return true;
        }
    }

    public void checkNumber(Product[] products){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getNumber() < 5) {
                System.out.println("" + products[i]);
            }
        }
    }

    public void checkPriceProduct(Product[] products,int option){
            for (Product product : products) {
                if (product.getPrice()<50000&&option==1) System.out.println(product);
                else if (product.getPrice()>=50000&&product.getPrice()<100000&&option==2) System.out.println(product);
                else if (product.getPrice()>=100000&&option==3) System.out.println(product);

            }
    }

    public void sortByPrice(Product[] products){
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length -1; j++) {
                if(products[j].getPrice()> products[j+1].getPrice()){
                    Product temp =  products[j];
                    //a[0] = 0
                    products[j] = products[j+1];
                    //a[1] = 1
                    products[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for (Product p : products
        ) {
            System.out.println(p);
        }
    }
}
