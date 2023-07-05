package atividades;
import java.util.Scanner;

    class RecursivaIV{

        public static int fatorialRec(int x) {
            if(x>0)
            return x*fatorialRec(x-1);
            return 1;
        }

        public static int fatorial(int x) {
            int fat = 1, i;

            for(i=1;i<=x;i++){
                fat = fat * i;
            }
            return fat;
        }

        public static void main(String [] args) {
            Scanner entrada = new Scanner (System.in);
            int x = entrada.nextInt();
            entrada.close();
            
            System.out.printf("Normal: %d\n",fatorial(x));
            System.out.printf("Recursivo: %d\n",fatorialRec(x));
            }
        }
