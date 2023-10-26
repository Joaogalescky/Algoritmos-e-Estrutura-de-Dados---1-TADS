import java.util.LinkedList;
/* LinkedList - Explicação
Uma lista encadeada ou lista ligada é uma estrutura de dados linear e dinâmica. Ela é composta por várias células que estão interligadas através de ponteiros, ou seja, cada célula possui um ponteiro que aponta para o endereço de memória da próxima célula
*/
import java.util.Scanner;

public class LinkedList{

public static Scanner entrada;
    public static void LinkedList() {
        // biblioteca LinkedList
        int i;
        LinkedList<Integer> valores;

        valores = new LinkedList<Integer>();
        //get recebe .get()... onde () e a posicao do vetor.
        //set Insere a informacao "set(index, element)...(posicao, valor)."

        valores.add(10);
        valores.add(20);
        valores.add(30);
        valores.add(40);
        valores.add(50);
        valores.add(60);

        valores.set(1, valores.get(1)+5);
        
        for(i = 0; i<valores.size(); i++){
            System.out.println(valores.get(i));
        }
    }

    public static void EX(){
        //variaveis
        int i;
        float valor = -1, soma = 0, media;

        //entrada
        Scanner entrada = new Scanner (System.in);
        LinkedList<Float> valores;
        valores = new LinkedList<Float>();
        
        System.out.println("digite varios valores. 0 para finalizar");

        //processo
        while(valor != 0.0){
           valor = entrada.nextFloat();
           if(valor != 0.0){
            valores.add(valor);
            }
        }

       //soma dos valores
       for(i = 0; i < valores.size(); i++){
           soma += valores.get(i);    
        }
        media = soma / valores.size();
        System.out.println("media: "+ media);
        entrada.close();
    }

    public static void EX1(){
        int i = 0, k = 100, passo = 10;
        LinkedList<Integer> valores;
        valores = new LinkedList<Integer>();
        
        while(i < k){
            valores.add(i);
            i += passo;
        }
        valores.remove(3);

        for(i = 0; i<valores.size(); i++){
            System.out.println(valores.get(i));
        }
    }

    public static void main(String[] args) {
        EX1();
    }
}
