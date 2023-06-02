//Elabore um código em Portugol ou em Java para a seguinte pergunta.
//Desenvolva um código que saiba determinar a duração de uma partida que ocorre e termina no mesmo dia.

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){

    //variáveis
    int hora_inicial, minuto_inicial, hora_final, minuto_final, tempo_hora, tempo_minuto;
    Scanner entrada;

    //entrada
    entrada = new Scanner(System.in);
    hora_inicial = entrada.nextInt();
    minuto_inicial = entrada.nextInt();
    hora_final = entrada.nextInt();
    minuto_final = entrada.nextInt();
    entrada.close();

    //processamento e saida
        if (hora_final>=hora_inicial && minuto_final>=minuto_inicial){
            tempo_hora = hora_final - hora_inicial;
            tempo_minuto = minuto_final - minuto_inicial;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tempo_hora, tempo_minuto);
        }
        else if(hora_final>=hora_inicial && minuto_final==00){
            tempo_hora = hora_final - hora_inicial;
            tempo_minuto = minuto_final;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tempo_hora, tempo_minuto);
        }
        else if(hora_final>=hora_inicial && minuto_final<=minuto_inicial){
            tempo_hora = hora_final - hora_inicial;
            tempo_minuto = minuto_inicial - minuto_final;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tempo_hora, tempo_minuto);
        }
    }
}
