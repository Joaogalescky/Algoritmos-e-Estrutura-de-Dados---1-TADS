import java.util.Scanner;

public class beecrowd1101 {
    public static void main(String[] args){
    
        //variaveis e entrada
        Scanner entrada = new Scanner(System.in);
        int M, N, soma, i;

        //processamento e saida
        while(((M=entrada.nextInt() )>0) && ((N=entrada.nextInt() )>0)){
            if(M>N){
                soma = 0;
                for(i=N; i<=M; i++){
                    soma = soma + i;
                    System.out.printf("%d ", i);
                }
            }
            else{
                soma = 0;
                for(i=M; i<=N; i++){
                    soma = soma + i;
                    System.out.printf("%d ", i);
                }
            }
            System.out.printf("Sum=%d\n", soma);
        }
        entrada.close();
    }
}

    // if = se.
    // else = senão.
    // else if = senão se.

    //Qual a diferença entre else e else if?
    //"senao se" = se a condicao anterior não for verdadeira verifique uma nova condicao.
    // else é apenas para quando nenhuma das condicoes anteriores foi verdadeira ai ele executa o else sem verificacao de condicao.

    //"+=" é um atalho para atribuir a uma variável o valor desta variável somada ao valor de uma outra.
    //pode se utilizar também: soma = soma + i;


    //Questão solucionada por
    //https://www.beecrowd.com.br/judge/pt/questions/view/1101/10565?origem=1