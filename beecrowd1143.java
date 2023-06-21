import java.util.Scanner;



public class beecrowd1143 {
    public static void main(String [] args) {

        //variaveis
        int N, i;
        Scanner entrada;

        //entrada
        entrada = new Scanner (System.in);
        N = entrada.nextInt();
        entrada.close();

        //processamento e saida
        if(N>1 && N<1000){ //Se N for maior que 1 e menor que 1000, prossiga
            for(i=1;i<=N;i++){ //Sistema de repetição: "i" é igual a 1, se "i" for menor ou igual a "N", "i" recebe +1
                System.out.printf("%d %d %d\n", i, i*i, i*i*i); //tentei utilizar o Math.pow(i,2) e (i,3), poren a saida não funcionou.
            }
        }
        else{ //Senão
            System.out.println("Operação inválida, por favor colocar números positivos entre 1 e 1000");
        }
    }   
}

