package atividades;
import java.util.Scanner;

public class segundos{
    public static void main(String[] args){
        //variáveis
        int hora, minutos, segundos, resultado;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite os segundos que se passaram desde às 0h: ");
        resultado = entrada.nextInt();
        entrada.close();

        //Processamento
        hora = resultado / 3600;
        resultado = resultado % 3600;
        minutos= resultado / 60;
        resultado = resultado % 60;
        segundos = resultado;

        //Saída
        System.out.printf("%d horas %d minutos e %d segundos\n", hora, minutos, segundos);
    }
}