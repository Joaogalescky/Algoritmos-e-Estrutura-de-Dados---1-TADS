package vetor_unidimensional;

import java.util.Scanner;

public class vetores_atv{

    public static void exercicio2(){
        int [] vetorA = {0,0,0,0,0,0,0,0,0,0};
        int [] vetorB = {0,0,0,0,0,0,0,0,0,0};
        int [] vetorC = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int n = 10, i, cont_vetorC = 0;
        Scanner entrada = new Scanner (System.in);

        //entrada
        System.out.println("Entre com 10 valores do vetor A: ");
        for(i = 0; i < n; i++){
            vetorA[i] = entrada.nextInt();
        }
        System.out.println("Entre com 10 valores do vetor B: ");
        for(i = 0; i < n; i++){
            vetorB[i] = entrada.nextInt();
        }
        entrada.close();

        //processamento
        for( i = 0; i < 10; i ++){
            vetorC[cont_vetorC] = vetorA[i]; //salvar a primeira posição do vetorA, pois cont_vetorc = 0
            cont_vetorC++;
            vetorC[cont_vetorC] = vetorB[i]; //vai salvar a segunda posição do vetorB, pois cont_vetorC = 1
            cont_vetorC++; //[...]
        }
        // Ou por operação matemática
        /*for (i = 0; i < 10; i ++){
            vetorC(i * 2) = vetorA[i];
            vetorC(2 * i + 1) = vetorB[i];
          }
        */

        System.out.println("Os valores do vetor C são: ");
        for(i = 0; i < 20; i++){
            System.out.printf("%d", vetorC[i]);
        }
    }

    public static void exercicio3(){ 
        int[] valores = {0,0,0,0,0,0,0,0,0,0};
        int n = 10, i;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Entre com 10 valores: ");
        for( i = 0; i < n; i++){
            valores[i] = entrada.nextInt();
            if(valores[i]<0){
                valores[i] = 0;
            }
        }
        entrada.close();

        System.out.println("Os valores processados são: ");
        for( i = 0; i < n; i++){
            System.out.println(valores[i]);
        }
    }

    public static void exercicio5(){
        /*Leia um vetor A, com 10 elementos. Crie em vetor B da seguinte forma:
            coloque os números pares primeiro;
            coloque os números ímpares logo após os pares;
            exiba o vetor B.
        */
        //entrada
        int vetorA[] = {0,0,0,0,0,0,0,0,0,0}; // ou vetorA[] = new int[10], ou int[] vetorA (que permiti definir depois);
        int vetorB[] = {0,0,0,0,0,0,0,0,0,0};
        //int n;
        int cont = 0;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite os 10 valores do vetorA: ");
        //System.out.println("Digite quantos valores você deseja inserir: ")
        //n = entrada.nextInt;
        //va = new int[n];
        //vb = new int[n];

        for(int i = 0; i < 10; i++){ //O número "10" pode ser substituído por va.lenght, pois vai entender o comprimento da memória, que é 10, do vetor
            vetorA[i] = entrada.nextInt();
        }

        entrada.close();

        //processamento
        //Procurando por números pares
        for(int i = 0; i < 10; i++){
            if(vetorA[i]%2 == 0){
                vetorB[cont] = vetorA[i];
                cont++;
            }
        }

        //Procurando por números impares
        for(int i = 0; i < 10; i++){
            if(vetorA[i]%2 == 1){
                vetorB[cont] = vetorA[i];
                cont++;
            }
        }

        System.out.println("Os valores do VetorB são: ");
        for(int i = 0; i < 10; i++){
            System.out.printf("%d", vetorB[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
    
        //exercicio2();
        //exercicio3();
        exercicio5();

    }
}