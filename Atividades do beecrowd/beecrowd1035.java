import java.util.Scanner;

public class beecrowd1035 {
 
    public static void main(String[] args) {
 
    //variaives
    int A, B, C, D;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();
    D = entrada.nextInt();
    entrada.close();
    
    //processamento e saida
        if (B>C && D>A && C+D>A+B && (C>0) && (D>0) && A%2==0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}