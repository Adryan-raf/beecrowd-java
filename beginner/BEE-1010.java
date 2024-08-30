import java.io.IOException;
     
import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in); 
        String user_entry= input.nextLine();
        
        String[] numbers =user_entry.split(" ");
        
        int cod = Integer.parseInt(numbers[0]);
        int stock = Integer.parseInt(numbers[1]);
        double price = Double.parseDouble(numbers[2]);
        
        double total_price = stock*price;
        
        user_entry= input.nextLine();
        
        numbers =user_entry.split(" ");
        
        
        cod = Integer.parseInt(numbers[0]);
        stock = Integer.parseInt(numbers[1]);
        price = Double.parseDouble(numbers[2]);
        
        total_price += stock*price;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total_price);
    }
}
