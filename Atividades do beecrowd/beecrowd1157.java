import java.util.Scanner; 
 
public class beecrowd1157 {
 
    public static void main(String[] args) {
 
        //variaveis
        int N, repetidor;
        Scanner entrada;
        
        //entrada
        entrada = new Scanner(System.in);
        N = entrada.nextInt();
        entrada.close();

        repetidor = 0;
        while(repetidor<=N){
            repetidor = repetidor + 1;
            if(N%repetidor==0)
            System.out.printf("%d\n", repetidor);
        }
    }
}

//Foi utilizado como base de estudo o beecrowd1157alternativo
//Readaptei para o formato while para estudo

//o repetidor vai servir para dar continuação a ação, sendo dado o valor de 0, uma condição para a repetição e caso não chegue a condição, some 1, até chega-la, no fim, ira mostrar a saida de todos os divisores que dão resto 0.