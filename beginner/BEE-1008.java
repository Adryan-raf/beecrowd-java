import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int hours = input.nextInt();
        double money = input.nextDouble();
        
        double salary = hours*money;
        
        System.out.printf("NUMBER = %d\n",number);
        System.out.printf("SALARY = U$ %.2f\n",salary);
    }

}
