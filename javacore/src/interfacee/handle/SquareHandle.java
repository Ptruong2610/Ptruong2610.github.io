package interfacee.handle;

import interfacee.entity.Square;

import java.util.Scanner;

public class SquareHandle {
    public Square inputSquare(Scanner scanner){
        System.out.println("nhập vào canh:");
        double side = Double.parseDouble(scanner.nextLine());
        Square square = new Square(side);
        return square;
    }
}
