//import
import java.util.LinkedList;
import java.util.HashSet;

public class Aula31102023{
    public static void main (String [] args){
        //variáveis
        LinkedList<String> roteiro = new LinkedList<String>();
        HashSet<String> cidades = new HashSet<String>();
        /*HashSet
        Para que serve:
        A classe HashSet é usada para criar uma coleção que usa um HashTable para armazenamento.
        Como funciona:
        O HashSet é o mais rápido de todos, este usa HashTable e seus elementos não são ordenados, a complexidade desta estrutura é O(1), em outras palavras, não importa o quanto você adicione, remova, retire, o tempo de execução sempre será o mesmo.
        */

        //entrada
        roteiro.add("Cascavel");
        roteiro.add("Toledo");
        roteiro.add("Gramado");
        roteiro.add("Jaraguá do Sul");
        roteiro.add("Campo Grande");
        roteiro.add("Joinville");
        roteiro.add("Cascavel");
        roteiro.add("Joinville");
        roteiro.add("Guarulhos");

        //processamento
        for(String i : roteiro){
            cidades.add(i);
        }

        System.out.printf("Foram visitadas %d cidades distintas\n", cidades.size());
    }
}