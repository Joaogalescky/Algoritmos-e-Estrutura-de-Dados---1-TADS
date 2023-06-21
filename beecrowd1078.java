import java.util.Scanner;

public class beecrowd1078 {
 
    public static void main(String[] args){
 
    //variaveis
    int N, i;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner(System.in);
    N = entrada.nextInt();
    i = 1;
    entrada.close();
    
        //processamento e saida
        if(N>2 && N<1000){ //Se N for maior que 2 e menor que 1000
            for(i=1;i<=10;i++){ //Sistema de repetição: "i" = 1, se "i" for < ou = a 10, "i" recebe +1
            System.out.printf("%d x %d = %d\n", i, N, i*N);
            }
        }
    }
}