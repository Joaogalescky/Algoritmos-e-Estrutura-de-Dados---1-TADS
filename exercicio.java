import java.util.Scanner;

public class exercicio{

    /*Exercicios
        13. Faça uma função chamada pot2 que retorna verdadeiro caso o parâmetro passado seja uma potência de 2.

        14. Desenvolva uma função chamada potN, que possui dois parâmetros x e n. A função deve retornar verdadeiro caso x seja uma potência de n.

        15. Implemente uma função chamada distanciaCartesiana que recebe dois pares de números, que correspondem a pontos em um plano cartesiano com coordenadas x, y. A função deve retornar a distância entre esses dois pontos. Não é necessário arredondar valores.
    */

    //public static boolean pot2(int x){

    /*
            if(x <= 0){ //"x" não pode ser menor ou igual a 0
                return false; //retorne false
            }
            return (x & (x - 1)) == 0; //O "&" vai fazer a validação do retorno
        } // retorne true

        public static void eh_pot2(int x){

            if(pot2(x)){
                System.out.printf("%d é uma potência de 2.\n", x);
            }else{
                System.out.printf("%d não é uma potência de 2.\n", x);
            }
        }
    */

    public static void potN(int x, int n){
        
        x = 16;
        n = 2;
                    
        if potN(x, n){
            System.out.println(x + " é uma potência de " + n);
            }else{
                System.out.println(x + " não é uma potência de " + n);
            }
        }
                
        public static boolean potN(int x, int n){
            if (x == 1){
                return true;  // Qualquer número elevado a 0 é igual a 1.
            }
                    
            for (int i = 1; i <= x; i++){
                int result = (int) Math.pow(n, i);
                        
                if (result == x){
                    return true;
                }else if (result > x){
                    break;  // Se o resultado da potência exceder x, não é uma potência de n.
                }
            }  
        return false;
    }

    //public static void distanciaCartesiana(int x, int y) {

    /*
            public static void main(String[] args) {
                double x1 = 1.0;
                double y1 = 2.0;
                double x2 = 4.0;
                double y2 = 6.0;
                
                double distancia = distanciaCartesiana(x1, y1, x2, y2);
                System.out.println("Distância entre os pontos: " + distancia);
            }
        
            public static double distanciaCartesiana(double x1, double y1, double x2, double y2) {
                double deltaX = x2 - x1;
                double deltaY = y2 - y1;
                double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
                return distancia;
            }
        }
    */

    public static void main(String[] args) {
        
        int x, y;

        Scanner entrada = new Scanner (System.in);
        x = entrada.nextInt();
        //y = entrada.nextInt();
        entrada.close();

        //eh_pot2(x);
    }
}