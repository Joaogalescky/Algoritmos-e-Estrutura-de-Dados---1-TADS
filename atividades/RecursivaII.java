package atividades;
import java.util.Scanner;

    class RecursivaII{

        public static void decrementa(int x) {
            System.out.println(x);
            if(x>0){
                decrementa(x-1);
            }
            System.out.println(x);
        }

        public static void main(String [] args) {
            Scanner entrada = new Scanner (System.in);
            int x = entrada.nextInt();
            entrada.close();
            
            decrementa(x);
            }
        }

//Na decrementação, a recursiva vai iniciar pela primeira função, e depois, ira executar em segundo plano a mesma operação com o outro valor de "X", chegando em "0", ira recorrer a memoria armazenada, seguindo um caminho em "pilha" (stack), do ultimo valor operado, até o primeiro valor.
//Caso a operação passe, ira ultrapassar a memoria, causando um (overflow)