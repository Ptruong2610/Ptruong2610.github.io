package interfacee.handle;

import interfacee.entity.Rectangle;

import java.util.Scanner;

public class RectangleHandle {
    public Rectangle inputRectangle(Scanner scanner){
        System.out.println("Nhâp chiều dài:");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp chiều rộng:");
        double width = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(length,width);
        return rectangle;
    }
}
