package d6_p_b_zambrano_hector;

// Creado por Hector ZAMBRANO
// 13 ENERO 2024

import java.util.Scanner;
public class MainMenu {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
        int option;
        
        // n * tc
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Print normal and inverted triangle");
            System.out.println("2. Exit program");
            System.out.print("Select an option: ");
            // ta
            option = scanner.nextInt();
            System.out.println("");
            // n*tc
            switch (option) {
                case 1:
                    System.out.print("Ingrese el tamano del triangulo : ");
                    //ta
                    int triangleHeight = scanner.nextInt();
                    System.out.print("Ingrese el simbolo a usar en el triangulo : ");
                    //ta
                    String sym = scanner.next();
                    //ta
                    Triangle triangle = new Triangle();
                    //ta
                    
                    triangle.printNormalTriangle(triangleHeight,sym);
                    //ta
                    triangle.printInvertedTriangle(triangleHeight,sym);
                    break;
                //case 2
                case 2:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option !=1 && option !=2);

        scanner.close();
    }
    
}
