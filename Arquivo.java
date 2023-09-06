package Aula_arquivo;

//Pesquisar
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo{
    public static void main(String[] args) {

        //variaveis
        int numero = 0;
        String result = "";
        PrintWriter saida;
        
        //entrada

        //1°
        //Scanner scanner = new Scanner (System.in);
        //numero = scanner.nextInt();
        //int vetor[] = new int [numero];
        //scanner.close();

        // //processamento

        //1°
        // try{
        //     for(int i = 1; i <= vetor.length; i++){
        //         saida = new PrintWriter("arq" + i + ".txt"); //Pesquisar
        //         result += i + "\n"; //by Emerson -- Pesquisar
        //         saida.print(result);
        //         saida.close();
        //     }
        // } catch (Exception e){
        //     System.out.println(e);
        // }


        //Usando outra biblioteca
        //2°
        //FileWriter arquivo1;
        
        // try{
        //     arquivo1 = new FileWriter("arq.txt", true); //Pesquisar
        //     saida = new PrintWriter(arquivo);
            
        //     saida.printf("-- %d --\n", 50);
        //     arquivo1.close();

        // }catch (Exception e){
        //     System.out.println(e);
        // }


        //Outra biblioteca
        //3°
        // int i, j, n = 10;

        // File arquivo2; //Pesquisar
        // Scanner entrada;
        // PrintWriter saida;
        // try{
        //     arquivo2 = new File("arq.txt"); //Pesquisar
        //     entrada = new Scanner (arquivo2); //Pesquisar
        //     saida = new PrintWriter("numeros.txt");

        //     while(entrada.hasNext()){ //Pesquisar
        //         i = entrada.nextInt();
        //         saida.println(i);
        //         System.out.println(i);;
        //     }

        //      saida.close();
        //      entrada.close();

        // } catch (Exception e){
        //     System.out.println(e);
        // }


        //Outra biblioteca
        //4°
        

    }
}
