package firstprogram.com;

import java.util.Scanner;

public class MyMain {

    // Method to calculate perimeter
    public double calculatePerimeter(RectangleShape object) {
        return 2 * (object.getLength() + object.getBreadth());
    }

    // Method to calculate area
    public double calculateArea(RectangleShape object) {
        return object.getLength() * object.getBreadth();
    }

    // Method to check if two rectangles are the same
    public boolean isSameRectangle(RectangleShape rectangleShape1, RectangleShape rectangleShape2) {
        if (rectangleShape1 == rectangleShape2) {
            return true;
        }
        if (rectangleShape1.getLength() == rectangleShape2.getLength() &&
                rectangleShape1.getBreadth() == rectangleShape2.getBreadth()) {
            return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating first rectangle object
        System.out.print("Enter length for object1: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter breadth for object1: ");
        double breadth1 = scanner.nextDouble();
        RectangleShape object1 = new RectangleShape(length1, breadth1);

        // Creating second rectangle object
        System.out.print("Enter length for object2: ");
        double length2 = scanner.nextDouble();
        System.out.print("Enter breadth for object2: ");
        double breadth2 = scanner.nextDouble();
        RectangleShape object2 = new RectangleShape(length2, breadth2);

        // Creating third rectangle object
        System.out.print("Enter length for object3: ");
        double length3 = scanner.nextDouble();
        System.out.print("Enter breadth for object3: ");
        double breadth3 = scanner.nextDouble();
        RectangleShape object3 = new RectangleShape(length3, breadth3);

        MyMain myMain = new MyMain();

        // Printing area and perimeter for each object
        System.out.println("Area of object1: " + myMain.calculateArea(object1));
        System.out.println("Perimeter of object1: " + myMain.calculatePerimeter(object1));

        System.out.println("Area of object2: " + myMain.calculateArea(object2));
        System.out.println("Perimeter of object2: " + myMain.calculatePerimeter(object2));

        System.out.println("Area of object3: " + myMain.calculateArea(object3));
        System.out.println("Perimeter of object3: " + myMain.calculatePerimeter(object3));

        // Checking if object1 and object2 are equal
        System.out.println("object1 and object2 are equal: " + myMain.isSameRectangle(object1, object2));

        // Checking if object2 and object3 are equal
        System.out.println("object2 and object3 are equal: " + myMain.isSameRectangle(object2, object3));

        scanner.close();
    }
}

