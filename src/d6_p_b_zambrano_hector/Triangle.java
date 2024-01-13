package d6_p_b_zambrano_hector;


public class Triangle{
    
   
// Creado por Hector ZAMBRANO
// 13 ENERO 2024
    
   //ta
    public void printNormalTriangle(int height,String symbol) {
        System.out.println(" ");
        // n* tc
        for (int i = 0; i < height; i++) {
            // n * tc
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    
    //ta
    public void printInvertedTriangle(int height,String symbol) {
        System.out.println(" ");
        // n* tc
        for (int i = height - 1; i >= 0; i--) {
            // n* tc
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}