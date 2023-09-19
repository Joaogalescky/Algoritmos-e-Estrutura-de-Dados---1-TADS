import java.util.Queue;
import java.util.LinkedList;

//Código FIFO (First in First out)
/*
FIFO é uma estrutura de dados (fila), que permite ao programador recuparar dados de uma estrutura na ordem em que foi colocado.

*/
//https://www.devmedia.com.br/classes-stack-queue-e-hashtable-colecoes-estrutura-da-linguagem-parte-3/19256
//https://www.delftstack.com/pt/howto/java/fifo-queue-java/
//http://ptcomputador.com/P/java-programming/90172.html

//Fila(Queue)
//enqueue --> insere uma coisa na coleção
//dequeue --> remove o item mais antigo da coleção
class Fila{
    public static void main(String[] args) {
        //variaveis
        Queue queue = new LinkedList<String>(); // Criar fila
        String value = (String) queue.remove(); //remove
        String head = (String) queue.peek(); //verificar qual o primeiro (head)
        int size = queue.size(); //verificar o tamanho

        //entrada
        queue.add("1°");
        queue.add("2°");
        queue.add("3°");

        //processamento
        System.out.println("Criar fila: " + queue);
        System.out.println("O elemento deletado primeiro foi: " + value);
        System.out.println("A fila após o delete: " + queue);
        System.out.println("O primeiro elemento da fila é: " + head);
        System.out.println("O tamanho da fila é: " + size);
    }
}