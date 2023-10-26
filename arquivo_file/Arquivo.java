
//Pesquisar
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo{
    public static void main(String[] args) {

        /* PrintWriter - explicacão
        PrintWriter é uma classe em Java que faz parte do pacote java.io. Ela é usada para escrever dados em formato de texto para uma variedade de saídas, como arquivos, streams de saída, sockets, entre outros. A classe PrintWriter fornece métodos convenientes para escrever dados formatados e tratamento de exceções.

        A principal vantagem do PrintWriter é que ele facilita a escrita de dados de forma legível, formatada e conveniente, especialmente quando se trabalha com texto. Ele fornece métodos como println, print, printf, entre outros, que permitem escrever dados seguidos de uma quebra de linha (no caso do println) ou sem quebra de linha (no caso do print), ou mesmo formatar a saída de acordo com especificações de formatação semelhantes à função printf em C.
        */

        /* FileWriter - explicacão
        FileWriter é uma classe em Java que faz parte do pacote java.io e é usada para escrever caracteres em um arquivo de texto. Ela é uma classe de nível mais baixo em comparação com PrintWriter, o que significa que ela lida apenas com a escrita de caracteres brutos em um arquivo, sem oferecer recursos de formatação ou tratamento avançado de saída.

        Para usar FileWriter, você normalmente segue estas etapas:

        Criar um objeto FileWriter que representa o arquivo de destino.
        Usar o método write para escrever caracteres no arquivo.
        Fechar o FileWriter para liberar recursos e garantir que os dados sejam gravados no arquivo.
        */

        /* hasNext() - explicacão
        O método hasNext() faz parte das classes que implementam a interface java.util.Iterator ou java.util.Scanner em Java e é usado para verificar se ainda existem elementos a serem lidos na fonte de entrada, como um arquivo, uma string ou a entrada padrão do teclado (System.in).

        No contexto de java.util.Iterator:
        hasNext() verifica se há mais elementos a serem iterados em uma coleção, como uma lista, um conjunto ou um mapa. Retorna true se houver mais elementos a serem iterados, caso contrário, retorna false.

        No contexto de java.util.Scanner:
        hasNext() verifica se ainda há dados a serem lidos da fonte de entrada (por exemplo, de um arquivo ou da entrada padrão). Retorna true se houver mais dados a serem lidos, caso contrário, retorna false.

        É usado para evitar tentar ler elementos quando não há mais elementos disponíveis para leitura, o que ajudará a evitar exceções de "fim de arquivo" ou "fim de entrada" não tratadas.
        */

        /* File - explicacão
        A classe File é usada principalmente para representar caminhos de arquivo e informações sobre arquivos e diretórios no sistema de arquivos, mas não possui métodos para ler diretamente o conteúdo de um arquivo.

        Para ler o conteúdo de um arquivo em Java, você normalmente usaria classes como FileInputStream, FileReader, BufferedReader, Scanner ou outras classes de leitura de arquivo, dependendo dos seus requisitos.

        Por exemplo, ao usar FileReader e BufferedReader para ler linhas de um arquivo, você pode verificar o fim do arquivo usando o método readLine(). Quando não houver mais linhas para ler, ele retornará null, o que indica o fim do arquivo:
        */

        //variaveis
        int numero = 0;
        String result = "";
        PrintWriter saida;

        //1°
        //Scanner scanner = new Scanner (System.in);
        //numero = scanner.nextInt();
        //int vetor[] = new int [numero];
        //scanner.close();
        // //processamento
        // try{
        //     for(int i = 1; i <= vetor.length; i++){
        //         saida = new PrintWriter("arq" + i + ".txt");
        //         result += i + "\n"; //by Emerson -- Pesquisar
        //         saida.print(result);
        //         saida.close();
        //     }
        // } catch (Exception e){
        //     System.out.println(e);
        // }

        //2°
        //FileWriter arquivo1;
        // try{
        //     arquivo1 = new FileWriter("arq.txt", true); //Pesquisar
        //     saida = new PrintWriter(arquivo);
        //    
        //     saida.printf("-- %d --\n", 50);
        //     arquivo1.close();
        //
        // }catch (Exception e){
        //     System.out.println(e);
        // }

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
    }
}
