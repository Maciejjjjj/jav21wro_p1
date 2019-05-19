package com.sda.revision;

import java.util.Scanner;

public class RevisionMain {
    public static void main(String[] args) {

        System.out.println("To write rectangle, type 1.");
        System.out.println("To write square, type 2.");
        System.out.println("To write triangle, type 3.");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Please enter length of first side of rectangle");
                int sideA = scanner.nextInt();

                System.out.println("Please enter length of second side of rectangle");
                int sideB = scanner.nextInt();

                Rectangle rec = new Rectangle(sideA, sideB);

                rec.draw();

                break;
            case 2:
                System.out.println("Please enter length of side of square");
                int sideSquare = scanner.nextInt();

                Square square = new Square(sideSquare);

                square.draw();

                break;

            case 3:

        }


    }
}
