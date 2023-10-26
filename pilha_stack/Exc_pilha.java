package pilha_stack;
import java.util.Stack;

public class Exc_pilha {
    public static void main(String[] args) {
        //entrada
        String expressao = "[](}{)";
        Stack <Character> pilha = new Stack<Character>();
        int i;
        char c;
        boolean erro = false;

        //processamento
        for(i = 0; i < expressao.length(); i++){
            c = expressao.charAt(i);

            switch(c){
                case '(':
                    pilha.push(c);
                break;
                case ')':
                    if(pilha.isEmpty()){
                        erro = true;
                    } else{
                        if(pilha.pop() != '('){
                            erro = true;
                        }
                    }
                break;
                case '{':
                    pilha.push(c);
                break;
                case '}':
                    if(pilha.isEmpty()){
                        erro = true;
                    } else{
                        if(pilha.pop() != '{'){
                            erro = true;
                        }
                    }
                break;
            
                case '[':
                    pilha.push(c);
                break;
                case ']':
                    if(pilha.isEmpty()){
                        erro = true;
                    } else{
                        if(pilha.pop() != '['){
                            erro = true;
                        }
                    }
                break;
            }
            if(erro){
                break;
            }
        }
        if(erro || !pilha.isEmpty()){
            System.out.println("Expressao inválida");
        } else{
            System.out.println("Expressao válida");
        }
    }
}
