package vetores;
import java.util.Scanner;

class Vetores{

    /*Variáveis Compostas
     * 
     * -v. homogêneas unidimensionais --> (vetores (ou) arrays)
     * -v. homogêneas multidimensionais --> (matrizes)
     * -v. heterogêneas --> (registros)
     * 
    */

    public static void vetores() {
        
    int n;
    int[] valores = {10,20,30,40,50,60,70,80,90,100};
    //--------------{0--1--2--3--4--5--6--7--8--9} = 10 elemetos

    valores[5] = 500;
    System.out.println(valores[5]);
    }

    public static void media_sem_vetores() {
        
        int v1, v2, v3, v4, v5, soma, n = 3;
        float media;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Entre com 5 valores");
        v1 = entrada.nextInt();
        v2 = entrada.nextInt();
        v3 = entrada.nextInt();
        v4 = entrada.nextInt();
        v5 = entrada.nextInt();
        entrada.close();

        soma = v1 + v2 + v3 + v4 + v5;
        media = soma/n;

        System.out.println(media);
        System.out.println("Acima da média");
        if(v1>=media){
            System.out.println(v1);
        }
        if(v2>=media){
            System.out.println(v2);
        }
        if(v3>=media){
            System.out.println(v3);
        }
        if(v4>=media){
            System.out.println(v4);
        }
        if(v5>=media){
            System.out.println(v5);
        }
    }

    public static void media_com_vetores_for() {

        int[] valores = {0,0,0,0,0,0,0,0};
        int n = 8, soma = 0, armz = 0;
        float media;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Entre com 8 valores:");
        for(int i = 0; i < n; i++){
            valores[i] = entrada.nextInt();
            // valores[0] = entrada.nextInt();
            // valores[1] = entrada.nextInt();
            // valores[2] = entrada.nextInt();
            // valores[3] = entrada.nextInt();
            // valores[4] = entrada.nextInt();
            // valores[5] = entrada.nextInt();
            // valores[6] = entrada.nextInt();
            // valores[7] = entrada.nextInt();
        }
        entrada.close();

        //soma = valores[0] + valores[1] + valores[2] + valores[3] + valores[4] + [...];

        for(int i = 0; i < n; i++){
            soma += valores[i];
        }

        media = (float) soma/n;

        System.out.println(media);
        System.out.println("Acima ou igual a média");

        for(int i = 0; i < n; i++){
            if(valores[i] >= media){
                armz++;
            }
        }

        System.out.printf("Os número que são maiores que a média: %d\n", armz);

        // if(valores[0]>=media){
        //     System.out.println(valores[0]);
        // }
        // if(valores[1]>=media){
        //     System.out.println(valores[1]);
        // }
        // if(valores[2]>=media){
        //     System.out.println(valores[2]);
        // }
        // if(valores[3]>=media){
        //     System.out.println(valores[3]);
        // }
        // if(valores[4]>=media){
        //     System.out.println(valores[4]);
        // }
    }

    public static void main(String[] args) {

        //vetores();
        //media_sem_vetores();
        //media_com_vetores_for();
    }
}