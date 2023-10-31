import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class Atividade31102023versaoProf {

    public static int[] elementos_unicos_int(int[] valores) {
        int[] unicos;

        HashSet<Integer> conjunto = new HashSet<>();
        for(int i = 0; i < valores.length; i++){
            conjunto.add(valores[i]);
        }

        unicos = new int[conjunto.size()];
        int i = 0;
        for(Integer u : conjunto){
            unicos[i] = u;
            i++;
        }

        return unicos;
    }

    public static void main (String [] args){
        int[] valores = {10, 9, 9, 7, 9, 10, 7, 8};
        int[] unicos = elementos_unicos_int(valores);

        System.out.println("Valores: \n[ ");
        for(int j = 0; j < valores.length; j++){
            System.out.printf("%d ", valores[j]);
        }
        System.out.println("]");
        System.out.printf("Elementos unicos: \n[ ");
        for(int j = 0; j < unicos.length; j++){
            System.out.printf("%d ", unicos[j]);
        }
        System.out.println("]");
    }
}
