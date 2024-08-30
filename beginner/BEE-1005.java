import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        double a = input.nextDouble()*3.5; 
        double b = input.nextDouble()*7.5;
        double med = (a+b)/11;
        
        System.out.printf("MEDIA = %.5f\n", med);
    }
 
}
