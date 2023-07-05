package atividades;
import java.util.Scanner;

    class Recursiva{

        public static void contagemDecrescente(int x) {
            while(x>=0){
                System.out.println(x);
                x--;
            }
        }

        public static void contagemDecrescenteRec(int x) {
                System.out.println(x);
                if(x>0){
                    x--;
                    contagemDecrescente(x);
                }
            }
        
        public static void main(String [] args) {
            Scanner entrada = new Scanner (System.in);
            int x = entrada.nextInt();
            entrada.close();
            
            contagemDecrescenteRec(x);
            }
        }