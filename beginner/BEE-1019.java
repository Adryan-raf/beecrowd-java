import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in); 
        
        int seconds= input.nextInt();
        
        int hours = seconds/3600;
        seconds%=3600;
        
        int minutes = seconds/60;
        seconds%=60;
        
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}
