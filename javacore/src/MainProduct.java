import entity.Product;
import handle.ProductHandle;
import view.Menu;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductHandle productHandle = new ProductHandle();
        int n;
        System.out.println("Nhập số lượng sản phẩm bạn muốn:");
        n = Integer.parseInt(scanner.nextLine());
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            Product product = productHandle.inputProduct(scanner, i);
            products[i] = product;
        }
        Menu menu = new Menu();
        int option;
        do {
            menu.showMenu();
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Danh sách sản phẩm:");
                    productHandle.getProduct(products);
                    break;
                case 2:
                    menu.menuSearchName(productHandle, products, scanner);
                    break;
                case 3:
                    Product product = menu.menuSearchID(scanner, productHandle, products);
                    System.out.println(product);
                    menu.showMenuUpdateNumber();
                    int options = Integer.parseInt(scanner.nextLine());
                    switch (options) {
                        case 1:
                            menu.menuUpdateNumberByID(scanner, productHandle, product);
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Nhập lại!!!");
                            break;
                    }
                    break;
                case 4:
                    productHandle.checkNumber(products);
                    break;
                case 5:
                    menu.menuSelectByPrice();
                    int optionss = Integer.parseInt(scanner.nextLine());
                    productHandle.checkPriceProduct(products, optionss);
                    break;
                case 6:
                    productHandle.sortByPrice(products);
                    break;
                case 7:
                    break;

                default:
                    System.out.println("Nhập lại!!!");
                    break;
            }
        } while (option != 7);
    }
}