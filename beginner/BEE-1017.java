import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        
        int time = input.nextInt();
        int speed = input.nextInt();
        
        int distance = time*speed;
        
        double fuel_spend = distance/12.0;
        
        System.out.printf("%.3f\n",fuel_spend);
    }
}
