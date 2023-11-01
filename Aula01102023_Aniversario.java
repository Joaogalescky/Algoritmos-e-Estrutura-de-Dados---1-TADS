import java.util.Scanner;
import java.util.HashSet;
import java.lang.Math; 

public class Aula01102023_Aniversario{

    public static int randomInt(int min, int max){
        return (int) ((Math.random()) * (max - min) + min);
    }
    public static void main(String[] args) {
        //variáveis
        int n_de_pessoas = 23, q_execucoes = 1000;
        int counter = 0, repeat = 0;
        int i = 0, j = 0;
        float porc;
        HashSet<Integer> datas = new HashSet<>();

        //processamento
        while(j < n_de_pessoas){

            while(i<n_de_pessoas){
            int random = randomInt(0, 364);
            datas.add(random);
            i++;
            }
            if(datas.size() < n_de_pessoas){
                repeat++;
            }
            i = 0;
            datas.clear();

            repeat += n_de_pessoas - datas.size();
            porc = (100 * repeat) / q_execucoes;
            System.out.printf("Chance de repetir = %.2f\n", porc);
            j++;
        }
    }
}