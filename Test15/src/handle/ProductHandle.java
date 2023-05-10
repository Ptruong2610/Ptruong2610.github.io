package handle;

import entity.Oder;
import entity.Product;
import entity.User;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductHandle {
    public Product inputProduct(Scanner scanner) {
        ProductHandle productHandle = new ProductHandle();
        System.out.println("Nhập tên sản phẩm ");
        String name = scanner.nextLine();
        System.out.println("Nhập tên thương hiệu sản phẩm phẩm: ");
        String nameBrand = scanner.nextLine();
        System.out.print("Nhập số lượng sản phẩm: ");
        int number = productHandle.isValidInput(scanner);
        System.out.print("Nhập giá bán sản phẩm: ");
        int price = productHandle.isValidInput(scanner);
        return new Product(name, nameBrand, number, price);
    }

    /* Đây là hàm trả về product theo id */
    public Product checkByProductID(ArrayList<Product> products, int productID) {
        for (Product product : products
        ) {
            if (product.getId() == productID)
                return product;
        }
        return null;
    }

    /* Đây là hàm tìm kiếm sản phẩm theo giá tiền */
    public void searchAndDisplayByPriceRange(Scanner scanner, ArrayList<Product> products) {
        ProductHandle productHandle = new ProductHandle();
        ArrayList<Product> results = new ArrayList<>();
        try {
            System.out.println("Mời bạn nhập Mức giá thấp nhất trong khoảng cần tìm:");
            int minPrice = productHandle.isValidInput(scanner);
            System.out.println("Mời bạn nhập Mức giá cao nhất trong khoảng cần tìm:");
            int maxPrice = productHandle.isValidInput(scanner);
            for (Product product : products) {
                if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                    results.add(product);
                }
            }
            if (results.isEmpty()) {
                System.out.println("Không tìm thấy sản phẩm nào trong khoảng giá này.Mời bạn chọn lại");
                searchAndDisplayByPriceRange(scanner, products);
            } else {
                System.out.println("Danh sách sản phẩm có giá từ " + minPrice + " đến " + maxPrice + " là:");
                for (Product product : results) {
                    System.out.println(product.toString());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi! Bạn phải nhập vào 1 số nguyên dương!!!");
            searchAndDisplayByPriceRange(scanner, products);
        }
    }

    /*Đây là hàm sửa sản phẩm theo id */
    public void editProductByID(Scanner scanner, ArrayList<Product> products) {
        ProductHandle productHandle = new ProductHandle();
        Menu menu = new Menu();
        System.out.println("Mời bạn nhập vào id sản phẩm: ");
        int id = productHandle.isValidInput(scanner);
        Product product = productHandle.checkByProductID(products, id);
        boolean check = false;
            if (product != null) {
                menu.menuAdminEditProduct();
                do {
                    System.out.println("Mời bạn chọn: ");
                    int chose = productHandle.isValidInput(scanner);
                if (chose == 1) {
                    System.out.print("Nhập số lượng thêm vào cho sản phẩm (số nguyên dương): ");
                    int number = productHandle.isValidInput(scanner);
                    product.setNumber(product.getNumber() + number);
                    check = true;
                } else if (chose == 2) {
                    System.out.print("Nhập giá bán mới cho sản phẩm (số nguyên dương): ");
                    int price = productHandle.isValidInput(scanner);
                    product.setPrice(price);
                    check = true;

                } else if (chose == 3) {
                    System.out.print("Nhập số lượng thêm vào cho sản phẩm (số nguyên dương): ");
                    int number1 = productHandle.isValidInput(scanner);
                    System.out.print("Nhập giá bán mới cho sản phẩm (số nguyên dương): ");
                    int price1 = productHandle.isValidInput(scanner);
                    product.setNumber(product.getNumber() + number1);
                    product.setPrice(price1);
                    check = true;
                } else {
                    System.out.println("Chọn lại!");
                    check = false;
                }
                }while (!check);

            } else {
                System.out.println("Không tìm thấy Sản phẩm có id=" + id + " !Hãy thử nhập lại");
                editProductByID(scanner, products);
            }
    }
    /* Đây là hàm xóa sản phẩm theo ID */
    public void deleteProductById(Scanner scanner,ArrayList<Product> products){
        ProductHandle productHandle = new ProductHandle();
        System.out.println("Mời bạn nhập vào id sản phẩm cần xóa: ");
        int id = productHandle.isValidInput(scanner);
//        int id = Integer.parseInt(scanner.nextLine());
        Product product = productHandle.checkByProductID(products,id);
        if (product!=null){
            products.remove(product);
        }
        else {
            System.out.println("Không tìm thấy sản phẩm có id=" + id + ". Hãy nhập lại");
            deleteProductById(scanner, products);
        }
    }

    /* Đây là hàm check dữ liệu người dùng nhập vào */
    public int isValidInput(Scanner scanner) {
        int check = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
//            System.out.print("Nhập giá trị  của sản phẩm (số nguyên dương): ");
            String input = scanner.nextLine();

            try {
                check = Integer.parseInt(input);
                if (check < 1) {
                    System.out.println("Lỗi: giá trị bạn nhập phải là số nguyên dương nhỏ nhất = 1. Vui lòng nhập lại:");
                } else {
                    isValidInput = true;

                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: "+"'" + input +"'"+ " bạn nhập không đúng. Vui lòng nhập lại!");
            }
        }
        return check;
    }
    /* Đây là hàm hiển thị danh sách sản phẩm */
    public void displayProduct(ArrayList<Product> products){
        for (Product product: products
        ) {
            System.out.println(product);

        }
    }
}
