import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        double radius = input.nextDouble();
        double volume = (4.0/3) * 3.14159 *Math.pow(radius,3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
