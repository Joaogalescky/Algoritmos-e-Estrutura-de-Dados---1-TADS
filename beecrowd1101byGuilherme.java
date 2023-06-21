import java.util.Scanner;

public class beecrowd1101byGuilherme {
    public static void main(String[] args){
        
        //variaveis e entrada
        int M, N, i, aux=1, soma=0, max=0, min=0;
        Scanner entrada = new Scanner(System.in);

        //processamento e saida
        while (aux>0){ // criando um repetidor
            M = entrada.nextInt();
            N = entrada.nextInt();

            if (M>N){
                max = M; //definindo quem é maior "max" e quem é menor "min"
                min = N;
            }else{
                max = N;
                min = M;
            }
            aux = min;

            if (aux>0){
                soma=0;
                for (i = min; i <= max; i++){
                System.out.printf("%d ", i);
                soma = soma + i; //ou soma = soma + i;
            }
            System.out.printf("Sum=%d\n", soma);
            }
        }
        entrada.close();
    }
}

//Código do Guilherme Augusto Schebenei