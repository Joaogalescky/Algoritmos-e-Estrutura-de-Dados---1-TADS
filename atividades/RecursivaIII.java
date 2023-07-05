package atividades;
import java.util.Scanner;

    class RecursivaIII{

        public static int somaRec(int x) {
            if(x>0)
                return(x + somaRec(x-1));

            return 0;
        }

        public static void main(String [] args) {
            Scanner entrada = new Scanner (System.in);
            int x = entrada.nextInt();
            entrada.close();
            
            System.out.println(somaRec(x));
            }
        }
