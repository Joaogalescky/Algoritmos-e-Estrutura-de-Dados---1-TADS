import java.util.Scanner;

public class beecrowd2702 {
    public static void main(String[] args) {
 
    //variaveis
        int CA, BA, PA, CR, BR, PR, Result;
        Scanner entrada;
    
    //entrada
        entrada = new Scanner(System.in);
        CA = entrada.nextInt();
        // CA = Frango disponivel
        BA = entrada.nextInt();
        // BA = Bife disponivel
        PA = entrada.nextInt();
        // PA = Massa disponivel
        CR = entrada.nextInt();
        // CR = Frango pedido
        BR = entrada.nextInt();
        // BR = Bife pedido
        PR = entrada.nextInt();
        // PR = Massa pedida
        entrada.close();
    
    //processamento e saida
            //os alimentos disponiveis supriram de forma exata ou sobrando
                if (CA>=CR && BA>=BR && PA>=PR){
                System.out.println("0");
            //faltou alimentos ou nao supriram
            } else if (CA<CR && BA<BR && PA<PR){
                Result = (CR-CA) + (BR-BA) + (PR-PA);
                System.out.printf("%d\n", Result);
            //faltou frango
            } else if (CA<CR && BA>BR && PA>PR){
                Result = (CR-CA);
                System.out.printf("%d\n", Result);
            //faltou frango e bife
            } else if (CA<CR && BA<BR && PA>PR){
                Result = (CR-CA) + (BR-BA);
                System.out.printf("%d\n", Result);
            //faltou massa
            } else if (CA>CR && BA>BR && PA<PR){
                Result = (PR-PA);
                System.out.printf("%d\n", Result);
            //faltou frango e massa
            } else if (CA<CR && BA>BR && PA<PR){
                Result = (CR-CA) + (PR-PA);
                System.out.printf("%d\n", Result);
            //faltou bife
            } else if (CA>CR && BA<BR && PA>PR){
                Result = (BR-BA);
                System.out.printf("%d\n", Result);
            //faltou bife e massa
            } else if (CA>CR && BA<BR && PA<PR){
                Result = (BR-BA) + (PR-PA);
                System.out.printf("%d\n", Result);
            }
        }
    }