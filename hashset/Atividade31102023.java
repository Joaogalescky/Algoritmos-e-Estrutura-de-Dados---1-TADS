import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class Atividade31102023 {

    public static int[] elementos_iguais_int(int[] valores) {
        int[] iguais;
        int n;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Quantos valores você gostaria de digitar? Digite\n");
        n = entrada.nextInt();
        iguais = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Digite o próximo valor na posição %d\n", i);
            iguais[i] = entrada.nextInt();
        }
        System.out.println("Os valores digitados foram:\n");
        System.out.print("valores = [");
        for(int j = 0; j < n; j++){
        System.out.print(iguais[j] + ", ");
        }
        System.out.println("]\n");
 
        return iguais;
    }

    public static int[] elementos_unicos_int(int[] valores) {
        int[] unicos;
        HashSet<Integer> entrada = new HashSet<Integer>();

        for(int i = 0; i < valores.length; i++){
            entrada.add(valores[i]);
        }

        unicos = new int(entrada.size());

        for(int j = 0; j < entrada.size(); j ++){
            if(unicos[i] == valor[i]){

            }
        }

        return unicos;
    }

    public static void main (String [] args){

    }
}
