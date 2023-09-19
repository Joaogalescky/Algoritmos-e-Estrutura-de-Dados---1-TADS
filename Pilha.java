import java.util.Stack;

//Pilha(Stack)
public class Pilha {
    public static void main(String[] args) {
        
        //variaveis
        int x;
        Stack <Integer> pilha = new Stack<Integer>();

        //entrada
        pilha.push(10); // -> push = colocar elemento
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        //processamento
        while(pilha.isEmpty()){// -> pilha.isEmpty vai fazer a ação "pop" até estar vazia
        x = pilha.pop(); // -> pop = retirar o elemento
        System.out.println(x); // -> 50, 40, 30, 20, 10 ...
        }
    }
}
