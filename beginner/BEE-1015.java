import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        int distance = input.nextInt();
        double fuel = input.nextDouble();
        
        double consumption = distance/fuel;
        
        System.out.printf("%.3f km/l\n", consumption);
    }
}
