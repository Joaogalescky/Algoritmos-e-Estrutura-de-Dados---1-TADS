package atividades;
import java.util.Scanner;

class eleição{
    public static void main (String[] args) {
        //variaveis
        float Candidato_1, Candidato_2, Candidato_3, Votos_branco, Votos_nulo, Total_eleitores;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite os votos do candidato 01: ");
        Candidato_1 = entrada.nextFloat();
        System.out.println("Digite os votos do candidato 02: ");
        Candidato_2 = entrada.nextFloat();
        System.out.println("Digite os votos do canditado 03: ");
        Candidato_3 = entrada.nextFloat();
        System.out.println("Digite os votos brancos: ");
        Votos_branco = entrada.nextFloat();
        System.out.println("Digite os votos nulos: ");
        Votos_nulo = entrada.nextFloat();
        entrada.close();

        //processamento
        Total_eleitores = Candidato_1 + Candidato_2 + Candidato_3 + Votos_branco + Votos_nulo;
        Candidato_1 =(Float) Candidato_1*100/Total_eleitores;
        Candidato_2 = (Float) Candidato_2*100/Total_eleitores;
        Candidato_3 = (Float) Candidato_3*100/Total_eleitores;
        Votos_branco = (Float) Votos_branco*100/Total_eleitores;
        Votos_nulo = (Float) Votos_nulo*100/Total_eleitores;

        //saida
        System.out.println("---------------------------------------------------");
        System.out.printf ("O total de eleitores participantes foi   : %%.2f.\n", Total_eleitores);
        System.out.printf ("O total de eleitoires do candidato 01 foi: %.2f%%.\n", Candidato_1);
        System.out.printf ("O total de eleitores do candidato 02 foi : %.2f%%.\n", Candidato_2);
        System.out.printf ("O total de eleitores do candidato 03 foi : %.2f%%.\n", Candidato_3);
        System.out.printf ("O total de eleitores de votos brancos foi: %.2f%%.\n", Votos_branco);
        System.out.printf ("O total de eleitores de votos nulos foi  : %.2f%%.\n", Votos_nulo);
        System.out.println("---------------------------------------------------");
    }
}