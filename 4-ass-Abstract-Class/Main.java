import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape : 1 - Rectangle, 2 - Circle, 3 - Triangle, 4 - Square, 5 - Exit: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            String name = "";
            double dimension1 = 0;
            double dimension2 = 0;

            System.out.println("Enter the name of the shape: ");
            scanner.nextLine(); // Consume the newline character
            name = scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter width: ");
                    dimension1 = scanner.nextDouble();
                    System.out.println("Enter height: ");
                    dimension2 = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(name, dimension1, dimension2);
                    System.out.println("Area: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());
                    break;
                case 2:
                    System.out.println("Enter radius: ");
                    dimension1 = scanner.nextDouble();
                    Circle circle = new Circle( dimension1);
                    System.out.println("Area: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());
                    break;
                case 3:
                    System.out.println("Enter side 1: ");
                    dimension1 = scanner.nextDouble();
                    System.out.println("Enter side 2: ");
                    dimension2 = scanner.nextDouble();
                    System.out.println("Enter side 3: ");
                    double dimension3 = scanner.nextDouble();
                    Triangle triangle = new Triangle( dimension1, dimension2, dimension3);
                    System.out.


                    println("Area: " + triangle.getArea());
                    System.out.println("Perimeter: " + triangle.getPerimeter());
                    break;
                case 4:
                    System.out.println("Enter side: ");
                    dimension1 = scanner.nextDouble();
                    Square square = new Square(name, dimension1);
                    System.out.println("Area: " + square.getArea());
                    System.out.println("Perimeter: " + square.getPerimeter());
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}