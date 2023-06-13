import java.util.Scanner;

public class beecrowd1066 {
    public static void main(String[] args) {
 
        //variaveis
        int N, i, positivo=0, negativo=0, par=0, impar=0;
        Scanner entrada;
    
        //entrada
        entrada = new Scanner (System.in);

        //processamento e saida
        for(i=1;i<=5;i++){ //Sistema de repetição: "i" = 1, se "i" menor ou igual a 5, "i" recebe + 1
            N = entrada.nextInt();
            if(N<0){ //Se "N" menor que 0
                negativo = negativo + 1;
            }
            else if(N>0){ //Se "N" maior que 0
                positivo = positivo + 1;
            }
            if(N%2==0){ //Se resto da divisão de "N" por 2 for = 0
                par = par + 1;
            }
            else if(N%2!=0){ //Se resto da divisão de "N" por 2 for diferente de 0
                impar = impar + 1;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
        entrada.close();
    }
}