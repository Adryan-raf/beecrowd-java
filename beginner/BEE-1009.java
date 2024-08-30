import java.io.IOException;
 
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        String  name = input.nextLine();
        double salary = input.nextDouble();
        double bonus= input.nextDouble()*0.15;
        double  tot = salary+ bonus;
        System.out.printf("TOTAL = R$ %.2f\n", tot);
    }

}
