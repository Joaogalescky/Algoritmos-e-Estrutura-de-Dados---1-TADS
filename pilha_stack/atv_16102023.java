package pilha_stack;
import java.util.Scanner;
import java.util.Stack;

//https://panda.ime.usp.br/algoritmos/static/eps/ep6/parted/parted-polonesa.html#:~:text=A%20nota%C3%A7%C3%A3o%20Polonesa%20(reversa)%20ou,express%C3%B5es%20em%20linguagens%20de%20programa%C3%A7%C3%A3o.
//Atividade Posfixada - Notação polonesa reversa

class atv_16102023{
    public static void main(String[] args){
        Stack<Integer> pilha = new Stack<Integer>();
        int i, op1, op2, res;
        String expressao = "5 2 +";
        String[] tokens = expressao.split(" ");

        for(i = 0; i < tokens.length; i++){
            System.out.println(tokens[i]);
            switch(tokens[i]){
                case "+":
                if(pilha.empty()){
                    System.out.println("Expressão inválida");
                }
                System.exit(i);
                op2 = pilha.pop();
                if(pilha.empty()){
                    System.out.println("Expressão inválida");
                }
                System.exit(i);
                op1 = pilha.pop();
                pilha.push(op1 + op2);
                System.out.println("Adição");
                break;
                case "-":
                if(pilha.empty()){
                    System.out.println("Expressão inválida");
                }
                System.exit(i);
                    op2 = pilha.pop();
                if(pilha.empty()){
                    System.out.println("Expressão inválida");
                }
                System.exit(i);
                    op1 = pilha.pop();
                    pilha.push(op1 - op2);
                    System.out.println("Subtração");
                break;
                case "*":
                if(pilha.empty()){
                    System.out.println("Expressão inválida");
                }
                System.exit(i);
                    op2 = pilha.pop();
                if(pilha.empty()){
                    System.out.println("Expressão inválida");
                }
                System.exit(i);
                    op1 = pilha.pop();
                    pilha.push(op1 * op2);
                    System.out.println("Multiplicação");
                break;
                default:
                    pilha.push(Integer.parseInt(tokens[i]));
                break;
            }
        }
        if(pilha.empty()){
            System.out.println("Expressão inválida");
        }
        System.exit(i);
        res = pilha.pop();
        if(pilha.empty()){
            System.out.println("Expressão inválida");
            System.out.println(i);
        }else{
            System.out.println(res);
        }

        // System.out.println(Integer.parseInt(valor) + 20);
    }
}