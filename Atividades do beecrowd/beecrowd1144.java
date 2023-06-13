import java.util.Scanner;

class beecrowd1144{
    public static void main(String[]args){

        //variaveis
        Scanner entrada;
        int i, n;

        //entrada
        entrada = new Scanner(System.in);
        n = entrada.nextInt();
        entrada.close();

        //processamento e saida
        for(i=1;i<=n;i++){
            //o repetidor "i" vai verificar se é menor ou igual a "n", se for, vai acrescentar 1
            //na saída, vai multiplicar "i" por ele mesmo, e depois vai acrescentar 1 nessa multiplicação
            System.out.printf("%d %d %d\n", i, i*i, i*i*i);
            System.out.printf("%d %d %d\n", i, i*i+1, i*i*i+1);
        }
    }
}