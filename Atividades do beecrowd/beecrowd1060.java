import java.util.Scanner;

public class beecrowd1060 {
 
    public static void main(String[] args){
 
        //variaveis
        Float N;
        int rep, armz;
        Scanner entrada;
        
        //entrada
        entrada = new Scanner(System.in);
        armz = 0;
        //armz vai armazenar a quantidade de números positivos
        //rep vai repetir a entrada até chegar a 6

        for(rep=0;rep<6;rep++){
            N = entrada.nextFloat();
            if(N>0.0){
                armz++;
            }
            entrada.close();
        }
        System.out.printf("%d valores positivos\n", armz);
    }
}

//Ajudinha do Emerson