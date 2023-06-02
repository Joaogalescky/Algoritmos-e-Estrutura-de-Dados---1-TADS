import java.util.Scanner;

public class beecrowd2057 {
    public static void main(String[] args) {

        //variaveis
        int S, T, F, Op, D;
        //S=Horário de saida
        //T=Tempo da viagem
        //F=Fuso horário
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        S = entrada.nextInt();
        T = entrada.nextInt();
        F = entrada.nextInt();
        entrada.close();

        //processamento e saida
        //regras
        if (S>=0 && S<=23 && T>=1 && T<=12 && F>=-5 && F<=5){
        //simplificando a operação
        D = S + T;
        Op = D + F;
        // se a soma do horario de saida e do tempo de viagem for maior que 24
        if (D>24)
            Op = D - 24 + F;
        // se a soma do horario de saida e do tempo de viagem for menor que o fuso horário
        if (D<-F)
            Op = D + 24 + F;
            System.out.printf("%d\n", Op);
        //caso não responda as regras
        } else{
            System.out.println("Operação inválida");
        }
    }   
}
