import java.util.Scanner;
import java.io.PrintWriter;

public class exerc_05_09_2023 {
    public static void main(String[] args) {
        // String mensagem = "busque conhecimento.";
        //int resposta = 42;

        // try{
        //     PrintWriter saida = new PrintWriter("saida.txt");
        //     //saida.println(mensagem);
        //     saida.printf("A resposta para a vida, universo e tudo mais é %d\n", resposta);
        //     saida.close();

        // }catch(Exception e){
        //     System.out.println("Erro no arquivo.");
        // }

        int numero;

        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextInt();
        entrada.close();

        try{
            PrintWriter saida_numeros = new PrintWriter("numeros.txt");
            PrintWriter saida_pares = new PrintWriter("pares.txt");
            PrintWriter saida_impares = new PrintWriter("impares.txt");

            for(int i = 1; i <= numero; i++){
                if(i % 2 == 0){ //par
                    saida_pares.println(i);
                }else{ //impar
                    saida_impares.println(i);
                }
                saida_numeros.println(i);
            }
            saida_numeros.close();
            saida_pares.close();
            saida_impares.close();
        } catch(Exception e){
            System.out.println("Erro no arquivo.");
        }
    }    
}
