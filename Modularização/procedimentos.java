import java.util.Scanner;

public class procedimentos{
//Um procedimento é um conjutno de linhas de um algoritmo que são agrupados, e quando o procedimento é chamado, todas as linhas são executadas.

//Exemplo:
//Tome como exemplo um sistema em que no início do algoritmo é mostrado um cabeçalho e ao fianl é mostrado um rodapé, estes compostos por uma sequência de "=". O algoritmo consiste em perguntar o nome do usuário e apresentar seu nome na tela, junto com a mensagem "Boa noite".

    //public static void main (String [] args){

        //variáveis
        //String nome;
        //Scanner entrada = new Scanner (System.in);

        //entrada
        //System.out.println("Digite o seu nome:");
        //nome = entrada.next();
        //entrada.close();

        //processamento
            //System.out.println("===============");
            //System.out.printf("Seja bem vindo: %s\n", nome);
            //System.out.println("===============");
    //}
    
    public static void linhas (){
        System.out.println("==================");
    }

    public static void main (String [] args){
        
        //variaveis
        String nome;
        Scanner entrada = new Scanner (System.in);

        //entrada
        linhas();
        System.out.println("Digite o seu nome:");
        nome = entrada.next();
        entrada.close();
        linhas();
        System.out.println("");

        //processamento
        linhas();
        System.out.printf("Seja bem-vindo! %s\n", nome);
        linhas();
    }

    // Pseudocogido
    // inicio
    //     módulos
    //         modulo linhas
    //             escreve("=================")
    //         fim modulo.
    //     variaveis
    //         caractere nome;
    //     cabecalho
    //         linhas();
    //     entrada e saida
    //         escreve("Nome:");
    //         leia(nome);
    //         escreve("Boa noite", nome);
    //     rodapé
    //         linhas();
    // fim
}