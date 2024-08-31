import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in); 
        
        String user_entry = input.nextLine();
        
        String[] numbers = user_entry.split(" ");
        
        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);
        
        double triangle = (a*c)/2;
        double circle = 3.14159*c*c;
        double trapezium = (a+b)*c/2;
        double square = b*b;
        double rectangle =a*b;
        
        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);
    }
}
