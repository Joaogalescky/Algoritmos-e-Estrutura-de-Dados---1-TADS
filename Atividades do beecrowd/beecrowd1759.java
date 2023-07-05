import java.util.Scanner;

public class beecrowd1759 {
 
    public static void main(String[] args){
 
    //variaveis
    int N, i;
    
    //entrada
    Scanner entrada = new Scanner (System.in);
    N = entrada.nextInt();
    entrada.close();
    
    //processamento e saida
        if(N>=0 && N<=Math.pow(10,6)){ //Se "N" for maior ou igual a 0, e "N" menor ou igual a 10^6
            for(i=1; i<N; i++){ //Sistema de repetição: "i" = 1, se "i" menor que "N", "i" recebe + 1
                System.out.printf("Ho ", i); //A saida vai ser a quantidade de "i" até "N"
                if(i==N-1){ //Se "i" for igual a "N" - 1
                    System.out.printf("Ho!\n");
                }
            }
        }
    }
}