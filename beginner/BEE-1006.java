import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        
        double a = input.nextDouble()*2;
        double b = input.nextDouble()*3;
        double c = input.nextDouble()*5;
        
        double med = (a+b+c)/10;
        
        System.out.printf("MEDIA = %.1f\n", med);
    }
 
}
