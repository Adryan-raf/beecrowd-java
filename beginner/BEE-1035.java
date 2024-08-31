import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
    int[] vet = new int[4];
    
    Main.fillvector(vet);
    
    String result = Main.validate(vet);
    
    System.out.printf("%s",result);
    }
    
    public static void fillvector(int[] vet){
        Scanner input = new Scanner(System.in);
        String userEntry= input.nextLine();
        String[] str = userEntry.split(" ");
        for(int i=0; i<4;i++){
            vet[i]= Integer.parseInt(str[i]);
        }
    }
    public static String validate(int[]vet){
        if (vet[1]> vet[2] && vet[3] > vet[0]){
            if((vet[2] + vet[3]) > (vet[0] + vet[1])){
                if(vet[2]>0 && vet[3]>0 && vet[0]%2==0){
                    return("Valores aceitos\n");
                }else{return"Valores nao aceitos\n";}
            }else{return"Valores nao aceitos\n";}
        }else{return "Valores nao aceitos\n";}
    }
}
