import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in); 
        
        int days = input.nextInt();
        
        int years = days/365;
        days%=365;
        
        int months = days/30;
        days%=30;
        
        
        System.out.printf("%d ano(s)\n", years);
        System.out.printf("%d mes(es)\n", months);
        System.out.printf("%d dia(s)\n", days);
    }
}
