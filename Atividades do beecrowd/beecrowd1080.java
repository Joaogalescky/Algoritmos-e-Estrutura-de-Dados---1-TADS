import java.util.Scanner;

public class beecrowd1080 {
 
    public static void main(String[] args) {
        
    //variaveis
    int N, i, mem, aux;
    Scanner entrada;
    
    //entrada
    entrada = new Scanner (System.in);
    aux = 0; //Variável de memoria para "N"
    mem = 0; //Variável de memória para "i"

    //processamento e saida
        for(i=1;i<=1;i++){ //Sistema de repetição: "i" = 1, se "i" for diferente de 10, "i" recebe +1
        N = entrada.nextInt(); //Entrada de N aberta até a quantidade de repetições
            if(N>aux){ //Se N maior que aux
                aux = N; //aux memoriza o número
                mem = i; //mem memoriza a posição do número
            }
        }
        System.out.printf("%d\n", aux);
        System.out.printf("%d\n", mem);
        entrada.close();
    }
}