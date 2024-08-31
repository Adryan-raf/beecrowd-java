import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in); 
        String user_entry= input.nextLine();
        String[] numbers = user_entry.split(" ");
        
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        
        int greater;
        
        if(a>b){
            if(a>c){
                greater=a;
            }else{
                greater =c;
            }
        }else{
            if(b>c){
                greater= b;
            }else{
                greater=c;
            }
        }
        
        System.out.printf("%d eh o maior\n", greater);
    }
}
