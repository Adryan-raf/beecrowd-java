import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in); 
        
        int value = input.nextInt();
        int notes= value;
        
        int hundred_note = notes/100;
        notes%=100;
        int fifty_note = notes/50;
        notes%=50;
        int twenty_note = notes/20;
        notes%=20;
        int ten_note = notes/10;
        notes%=10;
        int five_note = notes/5;
        notes%=5;
        int two_note = notes/2;
        notes%=2;
        int one_note = notes/1;
        System.out.printf("%d\n",value);
        System.out.printf("%d nota(s) de R$ 100,00\n", hundred_note);
        System.out.printf("%d nota(s) de R$ 50,00\n", fifty_note);
        System.out.printf("%d nota(s) de R$ 20,00\n", twenty_note);
        System.out.printf("%d nota(s) de R$ 10,00\n", ten_note);
        System.out.printf("%d nota(s) de R$ 5,00\n", five_note);
        System.out.printf("%d nota(s) de R$ 2,00\n", two_note);
        System.out.printf("%d nota(s) de R$ 1,00\n", one_note);
        
    }
}
